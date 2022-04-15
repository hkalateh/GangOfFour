package ir.hossein.structural.facade.facade;

import java.io.File;

public class VideoConversionFacadeTest {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}