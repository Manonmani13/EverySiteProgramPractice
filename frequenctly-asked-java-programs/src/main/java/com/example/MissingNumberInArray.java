package com.example;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int sum=0;
        int act=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        for(int i=1;i<=a.length+1;i++){
            act=act+i;
        }
        System.out.println(act-sum);
    }
}
