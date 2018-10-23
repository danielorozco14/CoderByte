package com.company.FirstReverse;

public class FirstReverse {

    public void Reverse(String n){

        StringBuilder str = new StringBuilder();
        for (int i = n.length ()-1; i>= 0; i--) {
            char c = n.charAt (i);
             str.append(c);
        }
        System.out.println(str);
    }

    public FirstReverse() {

    }

    /**
     * @return Un string al reves
     *  public static String FirstReverse(String str) {
     *         return new StringBuilder(str).reverse().toString();
     *     }
     */
}
