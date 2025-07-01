package com.example;

public class MaxMinElement {
    public static void main(String[] args) {
        int a[]={50,30,40,20,60};
        int max=a[0];
        int min=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Max "+max+" min "+min);
    }
}
