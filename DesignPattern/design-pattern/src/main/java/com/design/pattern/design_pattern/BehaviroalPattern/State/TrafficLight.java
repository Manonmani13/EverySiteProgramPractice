package com.design.pattern.design_pattern.BehaviroalPattern.State;

public class TrafficLight {
    private State currentState;


    public void setState(State state) {
        this.currentState = state;
    }

    public void change() {
        currentState.handleRequest();
    }
}
