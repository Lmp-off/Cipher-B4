package com.example.cipherb4;

import java.util.ArrayList;

public class SecretWordCipher implements Cipher {
    private final int firstLetter = 97;
    private final int countLetters = 25;
    private ArrayList<Character> arrays;

    public SecretWordCipher(String word) {
        createNewAlphabet(word);
    }

    public void setWord(String newWord) {
        createNewAlphabet(newWord);
    }

    private void createNewAlphabet(String wordChars) {
        arrays = new ArrayList<>();
        arrays.clear();

        for (char s : wordChars.toLowerCase().replaceAll(" ", "").toCharArray()
        ) {
            if (arrays.contains(s)) continue;
            arrays.add(s);
        }
        for (int i = 0; i <= countLetters; i++) {
            if (arrays.contains((char) (firstLetter + i))) continue;
            arrays.add((char) (firstLetter + i));
        }
    }

    @Override
    public String Cipher(String text) {
        StringBuilder builder = new StringBuilder();
        for (char a : text.toLowerCase().replaceAll(" ", "").toCharArray()
        ) {
            builder.append(cipherChar(a));
        }
        return builder.toString();
    }

    private char cipherChar(char ch) {
        return arrays.get(ch - firstLetter);
    }

    public String decode(String text) {
        StringBuilder builder = new StringBuilder();
        for (char a : text.toLowerCase().replaceAll(" ", "").toCharArray()
        ) {
            builder.append(decodeChar(a) + " ");
        }
        return builder.toString();
    }

    private char decodeChar(char ch) {
        System.out.println(arrays.indexOf(ch));
        return (char) (firstLetter + arrays.indexOf(ch));
    }

}
