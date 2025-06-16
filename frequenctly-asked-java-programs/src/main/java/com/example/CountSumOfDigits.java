package com.example;

public class CountSumOfDigits {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println(sum);
        
    }
    
}
