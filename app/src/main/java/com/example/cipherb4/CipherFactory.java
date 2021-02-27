package com.example.cipherb4;

//TODO:add more ciphers
public enum CipherFactory {
    CAESAR, SECRET_WORD,VIGENERE;

    public String CipheringText(String textToCipher) {
        switch (this) {
            case CAESAR:
                return new CaesarCipher(1).Cipher(textToCipher);
            case SECRET_WORD:
                try{
                    String[] input=textToCipher.split(":");
                    return new SecretWordCipher(input[0]).Cipher(input[1]);
                }
                catch (IndexOutOfBoundsException e){
                    return "incorrect input format";
                }
            case VIGENERE:
                try{
                    String[] input=textToCipher.split(":");
                    return new BattistaBellaso(input[0]).Cipher(input[1]);
                }
                catch (IndexOutOfBoundsException e){
                    return "incorrect input format";
                }
        }
        return null;
    }
    public String GetHint(){
        switch (this){
            case CAESAR:
                return "format( text )";
            case SECRET_WORD:
                return "format( keyword:text )";
        }
        return "format( text )";
    }
}
