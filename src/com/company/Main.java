package com.company;

import com.company.ChangeLetters.LetterChanges;
import com.company.FirstReverse.FirstReverse;
import com.company.firstFactorial.FirstFactorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LetterChanges ltr = new LetterChanges();
        System.out.println(ltr.LetterChanges(s.nextLine()));
        s.nextLine();

        /**@return Como obtener el codigo ASCII de una caracter
         * char c='c';
         *         System.out.println((double) c);//(double)c Sirve para parsear de char a entero,
         *         //funciona con cualquier tipo de dato
         */


        /**
        FirstFactorial fiF = new FirstFactorial();
	    Scanner s = new Scanner(System.in);
        System.out.print(fiF.FirstFactorial(s.nextInt()));

         FirstReverse fr = new FirstReverse();
         Scanner s = new Scanner(System.in);
         System.out.println(fr.Reverse(s.nextLine()));

         **/

    }
}
