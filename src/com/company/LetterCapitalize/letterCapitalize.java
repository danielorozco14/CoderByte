package com.company.LetterCapitalize;

import java.util.ArrayList;

public class letterCapitalize {
    public String letterCapitalize(String palabra) {
       //Capitalizar todas las palabras contenidas en una oracion
        StringBuilder sb = new StringBuilder();

        for (String pal : palabra.toLowerCase().split(" ")) {
            char primeraLetra = pal.substring(0, 1).charAt(0);
            if(primeraLetra >= 'a' && primeraLetra <= 'z'  ){
                sb.append((char)(primeraLetra - 32)).append(pal.substring(1)).append(" ");
            }else{
                sb.append(primeraLetra).append(pal.substring(1)).append(" ");
            }
            //sb.append(primeraLetra >= 'a' && primeraLetra <= 'z' ? (char)(primeraLetra - 32) : primeraLetra).append(pal.substring(1)).append(" ");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }
}
