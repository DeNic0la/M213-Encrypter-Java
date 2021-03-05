package com.company;

public interface Encrypter {
    byte[] encrypt(byte[] data);
    byte[] decrypt(byte[] data);
}
