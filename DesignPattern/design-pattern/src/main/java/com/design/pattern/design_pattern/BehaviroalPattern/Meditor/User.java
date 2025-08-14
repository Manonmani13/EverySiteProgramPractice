package com.design.pattern.design_pattern.BehaviroalPattern.Meditor;

public class User {
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.println(name + " is sending message: " + message);
        mediator.send(message, this);
    }
    
}
