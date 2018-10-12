/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author msameen.bscs16seecs
 */
public class Encryptor {
    private EncryptionStrategy strategy;
    private String plainText;
    public Encryptor(EncryptionStrategy strategy){
        this.strategy=strategy;
    }
    public String encrypt()throws Exception{
        return strategy.encryptData(plainText);
    }
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
}
