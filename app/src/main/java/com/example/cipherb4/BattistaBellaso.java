package com.example.cipherb4;

import android.util.Log;

public class BattistaBellaso extends Cipher {
    String mask;

    public BattistaBellaso(String mask) {
        this.mask = mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    /*
     * C=(char + key)%n
     * */
    @Override
    protected String Cipher(String text) {
        StringBuilder builder = new StringBuilder();
        char[] textByChars = text.toCharArray();
        char[] maskByChars = mask.toCharArray();

        if (text.length() != mask.length())
            throw new IndexOutOfBoundsException();

        for (int i = 0; i < text.length(); i++) {
            builder.append((char) (((textByChars[i] - 'a' + maskByChars[i] - 'a') % ('z' - 'a' + 1)) + 'a'));
        }

        return builder.toString();
    }
    /*
     * m=(c+n - key)%n
     * */
    @Override
    protected String Decode(String text) {
        StringBuilder builder = new StringBuilder();
        char[] textByChars = text.toCharArray();
        char[] maskByChars = mask.toCharArray();

        if (text.length() != mask.length())
            throw new IndexOutOfBoundsException();

        for (int i = 0; i < text.length(); i++) {
            builder.append((char) (((textByChars[i] - 'a' + ('z' - 'a' + 1) - (maskByChars[i] - 'a')) % ('z' - 'a' + 1)) + 'a'));
        }

        return builder.toString();
    }
}
