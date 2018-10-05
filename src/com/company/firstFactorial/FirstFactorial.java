package com.company.firstFactorial;

public class FirstFactorial {
    public FirstFactorial() {
    }

    public  int FirstFactorial(int num) {
        int aux=1;
        while(num>1){aux=aux*num;num--;}
        return aux;
    }
}
