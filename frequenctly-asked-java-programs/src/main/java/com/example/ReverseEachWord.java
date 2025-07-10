package com.example;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str="Welcome to Java";

        String s[]=str.split(" ");
        String reverse="";
        for(String v:s){
            String rw="";
            for(int i=v.length()-1;i>=0;i--){
                rw+=v.charAt(i);
            }
            reverse+=rw+" ";
        }
        System.out.println(reverse);

        //Approach 2
        String st[]=str.split("\\s");

        String wordStr="";
        for(String val:st){
            StringBuilder sb=new StringBuilder(val);
            sb.reverse();
            wordStr+=sb.toString()+" ";
        }
        System.out.println(wordStr);

    }
}
