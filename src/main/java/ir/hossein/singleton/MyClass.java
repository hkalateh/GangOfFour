package ir.hossein.singleton;

public class MyClass {

  private static MyClass myClass;

  private MyClass() {
  }

  public static MyClass getInstance() {
    if (myClass == null) {
      synchronized (MyClass.class) {
        if (myClass == null) {
          myClass = new MyClass();
        }
      }
    }
    return myClass;
  }
}
