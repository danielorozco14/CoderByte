package com.company.FirstReverse;


import java.util.ArrayList;

public class FirstReverse {

    public  void Reverse(String n){
        ArrayList<Character> arrayList = new ArrayList<Character>();

        for (int i = n.length ()-1; i>= 0; i--) {
            char c = n.charAt (i);
            arrayList.add(c);
        }
        for (int i=0;i<n.length();i++){
            System.out.print(arrayList.get(i));
        }

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
