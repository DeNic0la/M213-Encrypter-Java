package com.company;

public class BasicKeyEncrypter implements KeyEncrypter {
    @Override
    public byte[] encrypt(byte[] data, int key) {
        int toAdd = data.length % key-2;
        int toSubstract = data.length% key*2 ;

        byte[] enc = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            enc[i] = (byte) (i % 2 == 0 ? data[i] - toSubstract : data[i] + toAdd);
            enc[i] = (byte) (i%3==0?enc[i]+ toAdd : enc[i] - toSubstract);
        }
        return enc;
    }

    @Override
    public byte[] decrypt(byte[] data, int key) {
        int toSubstract = data.length % key-2;
        int toAdd = data.length% key*2 ;

        byte[] dec = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            dec[i] = (byte) (i % 2 == 0 ? data[i] + toAdd : data[i] - toSubstract);
            dec[i] = (byte) (i%3==0?dec[i]- toSubstract : dec[i] + toAdd);
        }
        return dec;
    }
}
