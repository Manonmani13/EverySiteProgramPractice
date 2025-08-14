package com.design.pattern.design_pattern.BehaviroalPattern.Memento;

public class Editor {
    String text;
    void write(String t) { text = t; }
    String save() { return text; }
    void restore(String m) { text = m; }

}
