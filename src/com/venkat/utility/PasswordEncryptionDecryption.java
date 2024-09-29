package com.venkat.utility;

import org.apache.commons.codec.binary.Base64;

//make sure you add the apache commons codec jars in the project through build path

public class PasswordEncryptionDecryption {

    public static void main(String[] args) {
        encryptPassword("pass@12345");
        decryptPassword("cGFzc0AxMjM0NQ==");


    }
    //	use below method to encrypt the password
    public static String encryptPassword(String pswd) {
        byte[] encodePwdBytes = Base64.encodeBase64(pswd.getBytes());
        String encodePwd = new String(encodePwdBytes);
        System.out.println("Password in plain text "+pswd);
        System.out.println("Encrypted Password "+encodePwd);

        return encodePwd;
    }

    // use below method to decrypt the encrypted password
    public static String decryptPassword(String pswd) {
        byte[] decodePwdBytes = Base64.decodeBase64(pswd.getBytes());
        String decodePwd = new String(decodePwdBytes);
        System.out.println("Password in plain text "+pswd);
        System.out.println("Encrypted Password "+decodePwd);

        return decodePwd;
    }


}
