package com.example;

public class CountNoOfDigits {
    public static void main(String[] args) {
        int n=123456;
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
        
    }
}
