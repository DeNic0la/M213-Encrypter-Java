package com.company;

public interface KeyEncrypter {
    byte[] encrypt(byte[] data, int key);
    byte[] decrypt(byte[] data, int key);
}
