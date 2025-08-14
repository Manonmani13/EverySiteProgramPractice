package com.design.pattern.design_pattern.BehaviroalPattern.Command;

public class LightOnCommand  implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    } 
    
}
