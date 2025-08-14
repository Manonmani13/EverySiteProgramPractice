package com.design.pattern.design_pattern.BehaviroalPattern.Observer;

public class User  implements Observer {
    
    @Override
    public void update(String message) {
        System.out.println( " received message: " + message);
    }
    
}
