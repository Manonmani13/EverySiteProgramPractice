package com.example;

public class CheckArrayEquals {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
        boolean status=a.equals(b);
        if(status==true)
        {
            System.out.println("Arrays are Equals");
        }
        else{
            System.out.println("Arrays are not Equals");
        }

        //logic 2
        boolean st=true;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    st=false;
                }
            }
            System.out.println("Arrays are Equals");
        }else{
            st=false;
        }

        if(status==true)
        {
            System.out.println("Arrays are Equals");
        }
        else{
            System.out.println("Arrays are not Equals");
        }

    }
}
