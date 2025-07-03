package com.example;

public class NumberOFEvenAndOdd {
    public static void main(String[] args) {
        int num=1234;
        int even_count=0;
        int odd_count=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0)
            even_count++;
            else
            odd_count++;
            num/=10;
        }
    }
    
}
