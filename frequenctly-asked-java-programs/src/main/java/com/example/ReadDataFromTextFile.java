package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        //Approach 1
        FileReader fr=new FileReader("/home/manonmani/Documents/Docker.odt");
        BufferedReader br=new BufferedReader(fr);
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();

        //Approach 2
        Scanner sc=new Scanner(fr);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        
    }
}
