package ir.hossein.methodFactory;

public class ChairFactory extends BaseChairFactory {
  @Override
  public Chair createChair(Type chairType) {
    Chair chair = switch (chairType) {
      case SOFA -> new Sofa();
      case WHEELCHAIR -> new WheelChair();
      default -> throw new IllegalArgumentException("type of chair is wrong");
    };

    chair.makeChair();
    chair.typeOfChair();
    return chair;
  }
}
