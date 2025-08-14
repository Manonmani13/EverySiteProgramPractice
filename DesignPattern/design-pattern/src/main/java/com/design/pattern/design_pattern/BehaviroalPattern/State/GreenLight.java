package com.design.pattern.design_pattern.BehaviroalPattern.State;

public class GreenLight implements State {
    @Override
    public void handleRequest() {
        System.out.println("Green light is ON, you can go!");
    }
    
}
