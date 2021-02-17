package com.example.cipherb4;

/*
*
* Class is ciphering EN alphabet chars by Caesar Cipher
*
* */
//TODO:add more languages support.
public class CaesarCipher {

    static String Convert(String text) {
        char[] c = text.toCharArray();
        for (int i = 0; i < c.length; i++) {
            c[i] = (char) Convert(c[i]);
        }
        return String.valueOf(c);
    }

    private static int ConvertUpperCase(int numb) {
        return ((numb - 64) % 26) + 65;
    }

    private static int ConvertLowerCase(int numb) {
        return ((numb - 96) % 26) + 97;
    }

    private static int Convert(char c) {
        if (Character.isUpperCase(c)) return ConvertUpperCase((int) c);
        return ConvertLowerCase((int) c);
    }
}
