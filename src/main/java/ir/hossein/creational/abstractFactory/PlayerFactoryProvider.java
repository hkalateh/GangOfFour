package ir.hossein.creational.abstractFactory;

public class PlayerFactoryProvider {
  public static PlayerAbstractFactory getInstance(TypeOfFactory typeOfFactory) {
    return switch (typeOfFactory){
      case MUSIC -> new MusicFactory();
      case VIDEO -> new VideoFactory();
      default -> throw new IllegalArgumentException("wrong arg is passed");
    };
  }


  enum TypeOfFactory{
    VIDEO,MUSIC
  }
}
