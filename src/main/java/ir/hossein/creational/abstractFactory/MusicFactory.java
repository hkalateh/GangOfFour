package ir.hossein.creational.abstractFactory;

import ir.hossein.creational.abstractFactory.music.MP3;
import ir.hossein.creational.abstractFactory.music.Music;
import ir.hossein.creational.abstractFactory.music.OGG;

public class MusicFactory extends PlayerAbstractFactory<Music> {
  @Override
  public Music create(String type) {
    return switch (type.toLowerCase()){
      case "mp3" -> new MP3();
      case "ogg" -> new OGG();
      default -> throw new IllegalArgumentException("wrong arg is passed");
    };
  }
}
