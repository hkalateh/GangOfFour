package ir.hossein.methodFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChairFactoryTest {

  @Test
  void createChair() {
    BaseChairFactory baseChairFactory = new ChairFactory();
    Chair sofa = baseChairFactory.createChair(BaseChairFactory.Type.SOFA);
    Chair wheelChair = baseChairFactory.createChair(BaseChairFactory.Type.WHEELCHAIR);
  }
}