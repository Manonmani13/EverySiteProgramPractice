package com.example;

public class CountOccurence {
    public static void main(String[] args) {
        String s="Java Programming Java oops";
        int totalCount=s.length();
        int totalCount_afterRemoveA=  s.replace("a", "").length();
        int count=totalCount-totalCount_afterRemoveA;
        System.out.println("Number Occurence of a is  "+count);
    }
}
