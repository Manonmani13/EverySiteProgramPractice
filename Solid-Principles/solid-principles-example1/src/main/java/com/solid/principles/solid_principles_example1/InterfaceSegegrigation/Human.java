package com.solid.principles.solid_principles_example1.InterfaceSegegrigation;

public class Human implements Eatable, Worker {
    @Override
    public void eat() {
        System.out.println("Eating food");
    }

    @Override
    public void work() {
        System.out.println("Working on tasks");
    }
    
}
