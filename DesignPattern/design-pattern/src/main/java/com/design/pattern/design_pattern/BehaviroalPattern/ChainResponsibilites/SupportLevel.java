package com.design.pattern.design_pattern.BehaviroalPattern.ChainResponsibilites;

public class SupportLevel extends Handler {
    
    @Override
    void handleRequest(String request) {
        if (request.equalsIgnoreCase("basic")) {
            System.out.println("Handling request at " + request + " support level.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for " + request + " support level.");
        }
    }
    
}
