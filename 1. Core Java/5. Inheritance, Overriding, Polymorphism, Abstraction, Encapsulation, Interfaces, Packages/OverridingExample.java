//overriding --> changing features/functionalities

// Base Class
class Multiplication {

  public void compute(double number) {
    double result = number * number;
    System.out.println("Result = " + result);
  }
}

// Derived Class
class SquareRoot extends Multiplication {

  // This method overrides compute() of Parent
  public void compute(double number) {
    double result = Math.sqrt(number);
    System.out.println("result = " + result);
  }
}

class OverridingExample {
  public static void main(String[] args) {
    
    // If a Parent type reference refers
    // to a Parent object, then Parent's
    // compute is called
    Multiplication multiplicationObj = new Multiplication();
    multiplicationObj.compute(4);

    // If a Parent type reference refers
    // to a Child object Child's show()
    // is called.
    Multiplication sqrtObj = new SquareRoot();
    sqrtObj.compute(4);
  }
}