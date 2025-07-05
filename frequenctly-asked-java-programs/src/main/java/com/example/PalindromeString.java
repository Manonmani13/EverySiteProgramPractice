package com.example;

public class PalindromeString {
    public static void main(String[] args) {
        String str="Manonmani";
        String org=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(org.equals(rev)?"Palindrome ":"Not Palindrome");

    }
    
}
