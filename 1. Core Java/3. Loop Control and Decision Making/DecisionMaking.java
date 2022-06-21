/*
This program implements an application to illustrate the use of Decision Making
*/

class DecisionMaking {

  public static void main(String[] args) {
    int year = 2024;

    //If the Boolean expression evaluates to true then if statement will be executed.
    //if not,else statement block will be executed.
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) //ckecking if 2024 is leap year or not
      System.out.println(year + " is a leap year ");
    else
      System.out.println(year + " is not a leap year");

    int marks = 90;
    //nested if..else statements
    if (marks < 0 || marks > 100) //printing the grade according to the marks
      System.out.println("Invalid marks");
    else if (marks > 80)
      System.out.println("Grade A");
    else if (marks > 60)
      System.out.println("Grade B");
    else if (marks > 40)
      System.out.println("Grade C");
    else
      System.out.println("Grade D");

    int choice = 2;
    //A switch statement allows a variable to be tested for equality against a list of values.
    switch (choice) {
    case 1:
      System.out.println("Case1: Value is: " + choice);
      break;
    case 2:
      System.out.println("Case2: Value is: " + choice);
      break;
    case 3:
      System.out.println("Case3: Value is: " + choice);
      break;
    default:
      System.out.println("Default: Value is: " + choice);
      break;
    }

  }
}