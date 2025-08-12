package com.design.pattern.design_pattern.StructuralDesignPattern.Composite;

public class Main {
    public static void main(String[] args) {
        FileSystem file1 = new File("File1.txt");
        FileSystem file2 = new File("File2.txt");
        
        Folder directory = new Folder("MyDirectory");
        directory.add(file1);
        directory.add(file2);
        
        directory.show();
    }
}
