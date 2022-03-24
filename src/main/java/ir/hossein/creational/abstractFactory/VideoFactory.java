package ir.hossein.creational.abstractFactory;

import ir.hossein.creational.abstractFactory.video.MKV;
import ir.hossein.creational.abstractFactory.video.MP4;
import ir.hossein.creational.abstractFactory.video.Video;

public class VideoFactory extends PlayerAbstractFactory<Video> {
  @Override
  public Video create(String type) {
    return switch (type.toLowerCase()) {
      case "mkv" -> new MKV();
      case "mp4" -> new MP4();
      default -> throw new IllegalArgumentException("wron arg is passed");
    };
  }
}
