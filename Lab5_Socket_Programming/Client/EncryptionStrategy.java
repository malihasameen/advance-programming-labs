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
public interface EncryptionStrategy {
    String encryptData(String plainText) throws Exception;
}
