package com.design.pattern.design_pattern.BehaviroalPattern.Meditor;


public class Mediator {

    void send(String message, User colleague) {
        // Logic to send message to the appropriate colleague
        System.out.println("Message sent: " + message + " to " + colleague.getName());
    }
    
}
