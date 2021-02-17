package com.example.cipherb4;

//TODO:add more ciphers
public enum CipherFactory {
    CAESAR, NEW;

    public String CipheringText(String textToCipher) {
        switch (this) {
            case CAESAR:
                return CaesarCipher.Convert(textToCipher);
            case NEW:
                return "NEW";
        }
        return null;
    }
}
