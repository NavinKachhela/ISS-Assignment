interface Printable {
  
  float PI = 3.14F; //variables are by default final static 
  
  void print(); //these methods are by default abstract
  
  default void method1() {
    System.out.println("inside default method");
  }

}

interface Showable extends Printable {
  //one interface can extend more than one interfaces 
  void show();
}
class InterfaceDemo implements Showable {
  //one class can implement more than 1 interfaces
  public void myOwnMethod() {
    System.out.println("inside my own method");
    //PI = 2;gives error bcoz it is final static
  }
  public void show() {
    System.out.println("inside show");
  }
  public void print() {
    System.out.println("inside print");
  }
}
class InterfaceExample {
  public static void main(String[] args) {
    InterfaceDemo interfaceObj = new InterfaceDemo();
    interfaceObj.myOwnMethod();
    interfaceObj.print();
    interfaceObj.show();
    Printable printObj = new InterfaceDemo();
    printObj.method1();
  }
}