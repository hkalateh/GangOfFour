package ir.hossein.creational.abstractFactory;

public abstract class PlayerAbstractFactory<T> {
  public abstract T create(String type);
}
