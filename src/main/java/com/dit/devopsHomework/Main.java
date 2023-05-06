package com.dit.devopsHomework;

public class Main {
    public static void main(String[] args) {
        System.out.printf("La suite de Fibonacci pour 50 itération est:\n");
        int n1=0,n2=1,n3,i,count=50;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print("\n "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
