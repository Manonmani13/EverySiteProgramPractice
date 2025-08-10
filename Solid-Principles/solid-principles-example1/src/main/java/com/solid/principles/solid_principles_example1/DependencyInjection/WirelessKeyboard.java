package com.solid.principles.solid_principles_example1.DependencyInjection;

public class WirelessKeyboard implements Keyboard {
    @Override
    public void connect() {
        System.out.println("Wireless keyboard connected");
    }
    
    // Additional methods specific to WirelessKeyboard can be added here    
    
}
