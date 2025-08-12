package com.design.pattern.design_pattern.StructuralDesignPattern.AdaptorDesignPattern;

public class MediaAdaptor implements MediaType {
    private AdvanceMediaType advanceMediaType =new AdvanceMediaType();


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaType.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaType.playMp4(fileName);
        }
    }
    
}
