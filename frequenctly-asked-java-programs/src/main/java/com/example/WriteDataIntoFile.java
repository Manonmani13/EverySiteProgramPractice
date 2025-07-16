package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("/home/manonmani/Documents/vacabularies");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hello");
        System.out.println("Completed !....");
        bw.close();
    }
}
