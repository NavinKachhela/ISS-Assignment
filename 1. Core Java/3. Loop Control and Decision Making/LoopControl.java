class LoopControl {
  public static void main(String[] args) {
    int tempVar = 10;

    System.out.println("while loop");
    //First condition is evaluated.if the condition is true then stmt part is executed.
    //if condition is false then control out of loop
    while (tempVar <= 15) {
      //if value is <= 15 it prints the value
      System.out.println("Value of tempVar: " + tempVar);
      tempVar++;
    }

    System.out.println("\nfor loop");
    System.out.println("break if number is 5");
    //First intialization;condition;iteration 
    for (tempVar = 1; tempVar < 10; tempVar++) {
      if (tempVar == 5)
        break;
      System.out.println("Value of tempVar: " + tempVar);
    }
    System.out.println("\ndo while loop");
    tempVar = 2;

    //if value is <5 it prints the value
    do {
      System.out.println(tempVar);
      tempVar++;
    } while (tempVar < 5);

    System.out.println("\ncontinue if number is 30");
    for (tempVar = 10; tempVar < 60; tempVar = tempVar + 10) {
      if (tempVar == 30)
        continue;
      System.out.println(tempVar);
    }
  }
}