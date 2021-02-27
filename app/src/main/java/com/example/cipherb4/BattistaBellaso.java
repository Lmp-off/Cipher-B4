package com.example.cipherb4;

public class BattistaBellaso implements Cipher{
    String mask;
    public BattistaBellaso(String mask){
        this.mask=mask;
    }
    @Override
    public String Cipher(String text) {
        StringBuilder builder = new StringBuilder();
        char[] txtC= text.toCharArray();
        char[] maskC= mask.toCharArray();

        if (text.length()==mask.length()){
            for (int i = 0; i <text.length() ; i++) {
                builder.append((char)((txtC[i]+maskC[i]-'a')%('z'+1)));
            }
            return builder.toString();
        }
        throw new IndexOutOfBoundsException();
    }
}
