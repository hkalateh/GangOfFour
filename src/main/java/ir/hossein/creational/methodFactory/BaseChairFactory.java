package ir.hossein.creational.methodFactory;

public abstract class BaseChairFactory {
  public abstract Chair createChair(Type chairType);

  enum Type{
    SOFA,WHEELCHAIR
  }
}
