package com.example.cipherb4;

public enum  CipherFactory {
    CEZAR("cezar");
    CipherFactory(String cezar) {
    }
    public String CipheringText(String textToCipher){
        switch (this){
            case CEZAR:return CezarCipher.Convert(textToCipher);
        }
        return " 11";
    }
}
