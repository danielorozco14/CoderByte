package com.company.SimpleAdding;

public class simpleAdding {

    public int simpleAdding(int num) {
        int acum=0;
        while(num>=0){
            acum+=num;
            num--;
        }
        return acum;
    }
}
