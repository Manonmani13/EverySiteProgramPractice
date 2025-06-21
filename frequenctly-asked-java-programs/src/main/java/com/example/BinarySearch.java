package com.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int k=5;
        int l=0;

        boolean flag=false;
        int h=a.length-1;

        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==k){
                System.out.println("Element Found..");
                flag=true;
                break;
            }
            if(a[m]<k){
                m=m+1;
            }
            if(a[m]>k){
                h=h-1;
            }
        }
        if(flag==false){
            System.out.println("Element Not Found");
        }

        //logic 2
        System.out.println(Arrays.binarySearch(a, 5));
    }
}
