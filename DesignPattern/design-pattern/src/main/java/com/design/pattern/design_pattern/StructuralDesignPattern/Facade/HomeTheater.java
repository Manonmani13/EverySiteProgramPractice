package com.design.pattern.design_pattern.StructuralDesignPattern.Facade;

public class HomeTheater {
    Tv tv= new Tv();
    Speaker speaker= new Speaker();
    void watchMovie() {
        tv.turnOn();
        speaker.turnOn();
        System.out.println("Watching movie with TV and Speaker");
    }   
}
