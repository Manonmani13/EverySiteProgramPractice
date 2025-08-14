package com.design.pattern.design_pattern.BehaviroalPattern.ChainResponsibilites;

public abstract class Handler {
    Handler nextHandler;
    void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    abstract void handleRequest(String request);
    
}
