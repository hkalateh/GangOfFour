package ir.hossein.creational.abstractFactory;

import ir.hossein.creational.abstractFactory.music.Music;
import ir.hossein.creational.abstractFactory.video.Video;
import org.junit.jupiter.api.Test;

class PlayerFactoryProviderTest {

  @Test
  void getInstance() {
    PlayerAbstractFactory abstractFactory = PlayerFactoryProvider.getInstance(PlayerFactoryProvider.TypeOfFactory.MUSIC);
    Music music = (Music) abstractFactory.create("mp3");
    music.play();
    music.typeOfMusic();
    abstractFactory = PlayerFactoryProvider.getInstance(PlayerFactoryProvider.TypeOfFactory.VIDEO);
    Video video = (Video) abstractFactory.create("mkv");
    video.play();
    video.typeOfVideo();
  }
}