package com.example;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=1234;
        int org_num=num;
        int rev=0;

        while (num!=0) 
        {
            rev=rev*10+num%10;
            num/=10;
            
        }
        System.out.println(org_num==rev?"Palindrome ":"Not Palindrome");
    }
}
