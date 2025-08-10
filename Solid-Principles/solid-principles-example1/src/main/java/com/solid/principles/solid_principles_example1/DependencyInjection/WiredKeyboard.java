package com.solid.principles.solid_principles_example1.DependencyInjection;

public class WiredKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Wired keyboard connected");
    }
    
    // Additional methods specific to WiredKeyboard can be added here
    
}
