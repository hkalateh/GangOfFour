package ir.hossein.creational.methodFactory;

import org.junit.jupiter.api.Test;

class ChairFactoryTest {

  @Test
  void createChair() {
    BaseChairFactory baseChairFactory = new ChairFactory();
    Chair sofa = baseChairFactory.createChair(BaseChairFactory.Type.SOFA);
    Chair wheelChair = baseChairFactory.createChair(BaseChairFactory.Type.WHEELCHAIR);
  }
}