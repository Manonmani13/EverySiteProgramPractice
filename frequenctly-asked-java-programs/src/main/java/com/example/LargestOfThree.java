package com.example;

public class LargestOfThree {
    public static void main(String[] args) {
        int a=500,b=200,c=300;
        if(a>b && a>c){
            System.out.println(a+" is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greater ");
        }
        else{
            System.out.println(c+" is greater");
        }

        //logic 2
        int logest1=a>b?a:b;
        int logest2=c>logest1?c:logest1;
        int logest=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println(logest2);
    }
}
