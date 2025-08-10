package com.solid.principles.solid_principles_example1.DependencyInjection;

public class DIPExample {
    public static void main(String[] args) {
        Keyboard wiredKeyboard = new WiredKeyboard();
        Computer computerWithWiredKeyboard = new Computer(wiredKeyboard);
        computerWithWiredKeyboard.connectKeyboard();

        Keyboard wirelessKeyboard = new WirelessKeyboard();
        Computer computerWithWirelessKeyboard = new Computer(wirelessKeyboard);
        computerWithWirelessKeyboard.connectKeyboard();
    }
}
