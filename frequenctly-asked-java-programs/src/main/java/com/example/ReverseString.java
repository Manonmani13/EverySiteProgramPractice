package com.example;

public class ReverseString {

    public static void main(String[] args) {
        String str="ABCD";
        String rev=null;
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);

        //logic 2
        char ch[]=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }

        //logic 3
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);

    }
    
}
