package com.example;

public class PrimeNo {
    public static void main(String[] args) {
        int num=3;
        int count=0;

        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%2==0)
                count++;
                if(count==2){
                    System.out.println("Prime Number");
                }
            }
        }
        else{
            System.out.println("Not PRime Number");
        }
    }
}
