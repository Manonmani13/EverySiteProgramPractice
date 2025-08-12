package com.design.pattern.design_pattern.StructuralDesignPattern.AdaptorDesignPattern;

public class AudioPlayer implements MediaType {
    private AdvanceMediaType advanceMediaType;

    public AudioPlayer() {
        advanceMediaType = new AdvanceMediaType();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
    
}
