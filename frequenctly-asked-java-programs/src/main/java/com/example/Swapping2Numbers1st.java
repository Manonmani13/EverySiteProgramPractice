package com.example;

public class Swapping2Numbers1st {
    public static void main(String[] args) {
        int a=10,b=20;
        //Logic 1
        int t=a;
        a=b;
        b=t;

        //logic 2
        a=a+b;
        b=a-b;
        a=a-b;

        //logic 3
        a=a*b;
        b=a/b;
        a=a/b;

        //logic 4
        a=a^b;
        b=a^b;
        a=a^b;

        //logic 5
        b=a+b-(a=b);
    }
    
}
