package com.example;

public class CountTheWord {
    public static void main(String[] args) {
        String s="Welcome to this";
        int count=1;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)==' ')&& s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
