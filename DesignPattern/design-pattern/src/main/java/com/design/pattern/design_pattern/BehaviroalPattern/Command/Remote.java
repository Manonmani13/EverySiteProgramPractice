package com.design.pattern.design_pattern.BehaviroalPattern.Command;

public class Remote {
    private Command command;

    public Remote(Command command) {
        this.command = command;
    }

    void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
    }
}
