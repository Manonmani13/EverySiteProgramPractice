package com.design.pattern.design_pattern.BehaviroalPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    List<Observer> observer=new ArrayList<>();
    void subscribe(Observer observer) {
        this.observer.add(observer);
    }
    void notify(String message) {
        for (Observer observer : observer) {
            observer.update(message);
        }
    }
}
