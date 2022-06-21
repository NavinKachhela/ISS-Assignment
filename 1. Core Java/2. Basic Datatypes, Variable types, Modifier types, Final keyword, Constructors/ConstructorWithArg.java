class ConstructorWithArg {
  /*
  Parameterized Constructor:-
  A Constructor which accepts argumrents is known as parameterized constructor.
  */
  ConstructorWithArg(int no) {
    System.out.println("This is constructor with arg : " + no);
  }
  public static void main(String[] args) {
    ConstructorWithArg constructorObject1 = new ConstructorWithArg(10);
    ConstructorWithArg constructorObject2 = new ConstructorWithArg(20);
  }
}