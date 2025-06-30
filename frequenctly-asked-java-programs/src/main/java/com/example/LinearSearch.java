package com.example;

public class LinearSearch {
    public static void main(String[] args) {
        int a[]={10,30,20,40,50};
        int searc=50;
        for(int i=0;i<a.length;i++){
            if(searc==a[i]){
                System.out.println("Element found at "+i);
                break;
            }
        }
        System.out.println("Element Not Found");

    }
}
