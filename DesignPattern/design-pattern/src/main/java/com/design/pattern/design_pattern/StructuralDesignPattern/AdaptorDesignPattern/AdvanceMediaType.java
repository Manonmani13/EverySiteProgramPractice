package com.design.pattern.design_pattern.StructuralDesignPattern.AdaptorDesignPattern;

public class AdvanceMediaType {
    void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}
