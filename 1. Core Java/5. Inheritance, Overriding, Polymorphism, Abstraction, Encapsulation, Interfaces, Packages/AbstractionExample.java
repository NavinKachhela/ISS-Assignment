/*
In this example Meeting is an abstract class contains one abstract method changeId 
and one non-abstract method
*/
abstract class Meeting {

  public abstract void changeId();

  public void mikeOnOff() {
    System.out.println("Mic status on/off");
  }

}

class Participant extends Meeting {
  //This method will override changeId method from Meeting class
  public void changeId() {
    System.out.println("participant will do it");
  }
}

class AbstractionExample {
  public static void main(String[] args) {
    Participant partObj = new Participant();
    partObj.changeId(); // calling overrided method
    partObj.mikeOnOff();
  }
}