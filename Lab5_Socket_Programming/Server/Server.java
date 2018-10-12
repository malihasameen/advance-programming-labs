package server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Key;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception{
        int number = 0;
        String msg = null,Decrypted = null,User_Hash = null,my_Hash = null;
                
        ServerSocket s1 = new ServerSocket(8081);
	Socket ss = s1.accept();
	Scanner sc = new Scanner(ss.getInputStream());
	number = sc.nextInt();
        Hash h=new Hash();
        if(number!=0){
            PrintStream p = new PrintStream(ss.getOutputStream());
            p.println("Acnowledged_number");
            Scanner sc1 = new Scanner(ss.getInputStream());
            msg = sc1.next();
                    
            if(msg!=null){
                PrintStream p1 = new PrintStream(ss.getOutputStream());
                p1.println("Acnowledged_msg");
                User_Hash=sc1.next();
                
                if(number==1){
                    AESDecrypt aes=new AESDecrypt();
                    Decrypted=aes.decrypt(msg);
                    System.out.println(Decrypted);
                    my_Hash=h.hashing( Decrypted);
                    
                    if(User_Hash.equals(my_Hash)){
                        p1.println("Recieved_correct");
                    }
                    else {
                        p1.println("Recieved_incorrect");
                    }
                }
                
                else if(number==2){
                    BlowfishDecrypt blow=new BlowfishDecrypt();
                    Decrypted=blow.decrypt(msg);
                    System.out.println(Decrypted);
                    my_Hash=h.hashing( Decrypted);
                    
                    if(User_Hash.equals(my_Hash)){
                        p1.println("Recieved_correct");
                    }
                    else {
                        p1.println("Recieved_incorrect");
                    }
                }
                        
                else if(number==3){
                    TripleDESDecrypt t=new TripleDESDecrypt();
                    Decrypted=t.decrypt(msg);
                    System.out.println(Decrypted);
                    my_Hash=h.hashing( Decrypted);
                    
                    if(User_Hash.equals(my_Hash)){
                        p1.println("Recieved_correct");
                    }
                    else {
                        p1.println("Recieved_incorrect");
                    }
                }
                
                else{
                    p1.println("send something usesful number");
                }
                        
            }
            
            else{
                p.println("send something usesful number");
            }
        }        
    }  
}
