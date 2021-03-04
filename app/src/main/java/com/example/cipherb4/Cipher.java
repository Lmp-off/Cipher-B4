package com.example.cipherb4;

abstract class Cipher {

    static boolean isDecoding = false;
    public String make(String text){
        if (isDecoding)
            return Decode(text);
        return Cipher(text);
    };
    protected abstract String Cipher(String text);

    protected abstract String Decode(String text);
}
