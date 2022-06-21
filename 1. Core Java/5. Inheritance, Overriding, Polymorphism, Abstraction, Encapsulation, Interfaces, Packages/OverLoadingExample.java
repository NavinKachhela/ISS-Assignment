// overloading  --> adding features/functionalities
class Addition {
  
  // Overloaded compute() --> This compute method takes two int parameters
  public void compute(int number1, int number2) {
    int result = number1 + number2;
    System.out.println("Result = " + result);
  }

  // Overloaded compute() --> This compute method takes three int parameters
  public void compute(int number1, int number2, int number3) {
    int result = number1 + number2 + number3;
    System.out.println("Result = " + result);
  }
}

class OverLoadingExample {
  public static void main(String[] args) {
    Addition additionObj = new Addition();
    additionObj.compute(10, 20); // args matched with compute method having two integar params
    additionObj.compute(10, 20, 30); // args matched with compute method having three integar params
  }

}