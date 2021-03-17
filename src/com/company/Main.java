package com.company;

public class Main {

    public static void main(String[] args) {
        /*
	    String myData = new String("Guten Tag, das ist ein Toller Text");
	    Encrypter myEncrypter = new BasicEncrypter();
	    String DecryptedData = new String(myEncrypter.encrypt(myData.getBytes()));
        String EncryptedData = new String(myEncrypter.decrypt(DecryptedData.getBytes()));

        System.out.println(myData);
        System.out.println(DecryptedData);
        System.out.println(EncryptedData);

         */
        String myData = new String("Guten Tag, das ist ein Toller Text");
        KeyEncrypter myEncrypter = new BasicKeyEncrypter();
        String DecryptedData = new String(myEncrypter.encrypt(myData.getBytes(),7));
        String WrongKeyData = new String(myEncrypter.decrypt(DecryptedData.getBytes(),3));
        String EncryptedData = new String(myEncrypter.decrypt(DecryptedData.getBytes(),7));
        System.out.println(myData);
        System.out.println(DecryptedData);
        System.out.println(WrongKeyData);
        System.out.println(EncryptedData);


    }
}
