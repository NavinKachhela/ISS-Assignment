/*
This program implements an application to illustrate the use of 
constructor overloading: A class having multiple constructor is said to be constructor overloading.
*/
class ConstructorOverloading {

  ConstructorOverloading() {
    System.out.println("I am default Constructor!");
  }
  ConstructorOverloading(int no) {
    System.out.println("I am Parametrized Constructor with " + no + " value");
  }
  ConstructorOverloading(String name) {
    System.out.println("Parametrized Constructor having string as argument : " + name);
  }
  ConstructorOverloading(float no) {
    System.out.println("Constructor with float arg: " + no);
  }
  ConstructorOverloading(int integerNumber, float floatNumber) {
    System.out.println("int float Constructor");
  }
  ConstructorOverloading(float floatNumber, int integerNumber) {
    System.out.println("float int Constructor");
  }

  public static void main(String[] args) {
    new ConstructorOverloading();
    new ConstructorOverloading("Java");
    new ConstructorOverloading(10);
    new ConstructorOverloading(10.00F);
    new ConstructorOverloading(10.00F, 10);
    new ConstructorOverloading(10, 10.00F);
    //new ConstructorOverloading(10, 10); //Ambiguity in constructor
    //new ConstructorOverloading(10F, 10F); // No suitable constructor found	
  }
}