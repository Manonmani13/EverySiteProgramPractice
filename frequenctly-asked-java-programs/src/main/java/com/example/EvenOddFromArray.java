package com.example;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
            else{
                System.out.println("Odd "+a[i]);
            }
        }

        //logic 2

        for(int n:a){
            if(n%2==0){
                System.out.println("Event ");
            }
        }
    }
}
