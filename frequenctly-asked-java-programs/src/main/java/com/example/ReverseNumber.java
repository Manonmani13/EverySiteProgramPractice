package com.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;
        int rev=0;
        while(num!=0){
            rev*=10+num%10;
            num/=10;
        }

        //logic 2
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        sb.reverse();
    }
}
