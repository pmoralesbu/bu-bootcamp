public class testingObjects {
  public static void main(String[] args) {
    Dog x = new Dog();
    x.size = 34;
    x.name = "happy dog 1";
    x.dogAge = 459;

    Dog x1 = new Dog();
    x1.size = 12;
    x1.name = "happy dog 2";
    x1.dogAge = 234;


    x.bark();
    x1.bark();
  }

}

class Dog {
  int size;
  String name;
  double dogAge;

  void bark() {
    if (size > 60) {
      System.out.println("sucker ");
    } else if (size > 14) {
      System.out.println("sucker second time");
    } else {
      System.out.println("we are done");
    }
  }
}