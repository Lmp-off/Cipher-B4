package com.example.cipherb4;

import android.util.Log;
//A=65 Z=90
//a=97 z=122
public class CezarCipher {//(x-64)%26+65(UpperENG)
    static String Convert(String text){
        char[] c =text.toCharArray();
        Log.i("Bit find", (int)c[0]+"");
        for (int i = 0; i <c.length ; i++) {
            c[i]= (char) CheckChar(c[i]);
        }
        return String.valueOf(c);
    }
    private static int ConvertUpperCase(int numb){
        return ((numb-64)%26)+65;
    }
    private static int CheckChar(char c){
        if (Character.isUpperCase(c))return ConvertUpperCase((int)c);
        return 0;
    }
}
