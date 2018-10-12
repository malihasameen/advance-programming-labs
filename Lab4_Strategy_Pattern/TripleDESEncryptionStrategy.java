/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptortest;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author msameen.bscs16seecs
 */
public class TripleDESEncryptionStrategy implements EncryptionStrategy {

    @Override
    public void encryptData(String plaintext) {
        System.out.println("\n-------Encrypting data using TripleDES algorithm-------");
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("TripleDES");
            keyGenerator.init(112);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plaintTextByteArray = plaintext.getBytes("UTF8");

            Cipher cipher = Cipher.getInstance("TripleDES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plaintTextByteArray);

            System.out.println("Original data: " + plaintext);
            System.out.println("Encrypted data:");
            for (int i = 0; i < cipherText.length; i++) {
                System.out.print(cipherText[i] + " ");

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
