package com.company;

public class Main {

    public static void main(String[] args) {
	    String myData = new String("Guten Tag, das ist ein Toller Text");
	    Encrypter myEncrypter = new BasicEncrypter();
	    String DecryptedData = new String(myEncrypter.encrypt(myData.getBytes()));
        String EncryptedData = new String(myEncrypter.decrypt(DecryptedData.getBytes()));

        System.out.println(myData);
        System.out.println(DecryptedData);
        System.out.println(EncryptedData);
    }
}
