package com.company.SimpleSymbols;

public class simpleSymbols {
    /**
     *
     * @param  str(String)
     * @return take the str parameter being passed and determine if it is an acceptable sequence by either
     * returning the string true or false. The str parameter will be composed of '+' and '=' symbols with several letters
     * between them (ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a '+' symbol.
     * So the string to the left would be false.
     */
    public String simpleSymbols(String str) {
        int acum=0;
         if(str.startsWith("+")||str.startsWith("=")){
            for(int j = 1; j < str.length()-1 ; j++){
                if(str.charAt(j)>='a'&&str.charAt(j)<='z'){
                    if (str.charAt(j-1)=='+' && str.charAt(j+1)=='+')
                        acum=1;
                    else{
                        System.out.println("false");
                        break;
                    }
                }
            }
        }
        else if(str.startsWith("+")!=true &&str.charAt(0)>='a'&&str.charAt(0)<='z'){
            System.out.println("false");
        }
        else if(str.charAt(1)=='+'){
            for(int j = 2; j < str.length()-2 ; j++){
                if(str.charAt(j)>='a'&&str.charAt(j)<='z'){
                    if (str.charAt(j-1)=='+' && str.charAt(j+1)=='+')
                        acum=1;
                    else{
                        System.out.println("false");
                        break;
                    }
                }
            }
        }
        if (acum==1)
            System.out.println("true");
        return " ";
    }

    /**
     * MEJOR SOLUCION !!
     *
     * if (str.charAt(0) >= 65 && str.charAt(0) <= 122)
     *                     return "false";
     * 		else if (str.charAt(str.length() - 1) >= 65 && str.charAt(str.length() - 1) <= 122)
     *                 return "false";
     *
     * 		for (int i = 1; i < str.length() - 1; i++) {
     *         if (str.charAt(i) >= 65 && str.charAt(i) <= 122) {
     *             if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+')
     *                 return "false";
     *         }
     *     }
     *     return "true"
     *
     */

}
