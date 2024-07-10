package com.venkat.utility;

public class PasswordStoredInLocal {

    public static void main(String[] args) {
        //We can setup the envrypted password in our local environment variables and then retrieve it using the following code
        System.out.println(System.getenv("JAVA_HOME"));
        String encryptedPassword = System.getenv("<ENV_VARIABLE_NAME>");
        if(encryptedPassword!=null) {
            PasswordEncryptionDecryption ped = new PasswordEncryptionDecryption();
            System.out.println(ped.decryptPassword(encryptedPassword));
        }
        else{
            throw new RuntimeException("The mentioned environment variable does not exist");
        }
    }


}
