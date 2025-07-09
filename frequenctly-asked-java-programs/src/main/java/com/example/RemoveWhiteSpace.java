package com.example;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String s="Java          Progranning        Selenium       automation";
        s=s.replaceAll("\\s", "");
        System.out.println(s);
    }
}