package com.design.pattern.design_pattern.StructuralDesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
     String name;
    List<FileSystem> items =new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    public void addItem(FileSystem item) {
        items.add(item);
    }

    @Override
    public void show() {
        System.out.println("Folder: " + name);
    }
    public void add(FileSystem file2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
}
