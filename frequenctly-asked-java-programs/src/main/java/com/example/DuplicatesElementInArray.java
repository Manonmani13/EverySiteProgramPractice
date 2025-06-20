package com.example;

import java.util.HashSet;

public class DuplicatesElementInArray {
    public static void main(String[] args) {
        String arr[]={"java","C","C++","Python","java"};

        //approach 1
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Found Duplicate "+arr[i]);
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("Duplicate Element Not Found ");
        }

        //Approach2: HashSet

        HashSet langs=new HashSet<>();
        
        for(String l:arr){
            if(langs.add(l)==false){
            System.out.println("Found Duplicate Element "+l);

            }
        }

    }
}
