package com.example.cipherb4;

/*
*
* Class is ciphering EN alphabet chars by Caesar Cipher use 1 step
*
* */
public class CaesarCipher extends Cipher{
    int step=1;

    int offset;
    CaesarCipher(int offset){
        this.offset=offset;
    }
    @Override
    protected String Cipher(String text) {
        char[] c = text.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) Convert(c[i]);
        }
        return String.valueOf(c);
    }

    @Override
    protected String Decode(String text) {
        char[] c = text.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) A(c[i]);
        }
        return String.valueOf(c);
    }

    private int ConvertUpperCase(int numb) {
        return ((numb - 64) % 26) + 65;
    }
    private int A(char a){
        if (a-'a'==0)return 'z'+(a-'a'+step-1);
        return (a-step);
    }
    private int ConvertLowerCase(int numb) {
        return ((numb - 96) % 26) + 97;
    }

    private int Convert(char c) {
        if (Character.isUpperCase(c)) return ConvertUpperCase((int) c);
        return ConvertLowerCase((int) c);
    }
}
