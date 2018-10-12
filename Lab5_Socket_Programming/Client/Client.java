/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.Scanner;

/**
 *
 * @author msameen.bscs16seecs
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int number;
        String message, encryptedMessage = null, key;
        
	Scanner sc = new Scanner(System.in);
	Socket s = new Socket("10.3.34.42",8081);
	Scanner sc1 = new Scanner(s.getInputStream());
	
        System.out.println("Choose Algorithm(1,2 or 3):\n1.AES\n2.Blowfish\n3.TripleDES");
	number = sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
	p.println(number); 
	System.out.println(sc1.next());
        
        System.out.println("Enter a message!");
        message = sc.next();
        
        if (number == 1){
            EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
            Encryptor aesEncryptor=new Encryptor(aesStrategy);
            aesEncryptor.setPlainText(message);
            encryptedMessage = aesEncryptor.encrypt();
        }
        
        else if (number == 2){
            EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
            Encryptor blowfishEncryptor=new Encryptor(blowfishStrategy);
            blowfishEncryptor.setPlainText(message);
            encryptedMessage = blowfishEncryptor.encrypt();
        }
        
        else if (number == 3){
            EncryptionStrategy tripleDESStrategy=new TripleDESEncryptionStrategy();
            Encryptor tripleDESEncryptor=new Encryptor(tripleDESStrategy);
            tripleDESEncryptor.setPlainText(message);
            encryptedMessage = tripleDESEncryptor.encrypt();
        }
        
        Scanner sc2 = new Scanner(s.getInputStream());
        PrintStream p1 = new PrintStream(s.getOutputStream());
        p1.println(encryptedMessage);
        System.out.println(sc2.next());
        
	MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(message.getBytes());
	byte[] bytes = md.digest();
	StringBuilder sb = new StringBuilder();
	for(int i=0; i< bytes.length ;i++){
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	}
	//Get complete hashed password in hex format
	key = sb.toString();
        System.out.println(key);
        
        PrintStream p2 = new PrintStream(s.getOutputStream());
        p2.println(key);
        Scanner sc3 = new Scanner(s.getInputStream());
        System.out.println(sc3.next());
        
    }
    
}
