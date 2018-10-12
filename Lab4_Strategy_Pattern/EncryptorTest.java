/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptortest;

/**
 *
 * @author msameen.bscs16seecs
 */
public class EncryptorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
        Encryptor aesEncryptor=new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();

        EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor=new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
        
        EncryptionStrategy tripleDESStrategy=new TripleDESEncryptionStrategy();
        Encryptor tripleDESEncryptor=new Encryptor(tripleDESStrategy);
        tripleDESEncryptor.setPlainText("This is plain text");
        tripleDESEncryptor.encrypt();
    }
    
}
