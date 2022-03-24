package ir.hossein.creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

  @org.junit.jupiter.api.Test
  void getInstance() {
    MyClass myClass1 = MyClass.getInstance();
    MyClass myClass2 = MyClass.getInstance();
    assertEquals(myClass2,myClass1);
  }
}