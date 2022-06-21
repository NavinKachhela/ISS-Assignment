class DefaultConstructor {
  /* Constructor :- A Constructor is a special member method , that is automatically
  class is created it should have same as that of the class name --> ( case sensitieve)
  they will never have any return type not even void:
  */
  DefaultConstructor() {
    System.out.println("I am a Constructor, and I'm Called!");
  }

  public static void main(String[] args) {
    DefaultConstructor constructorObj1 = new DefaultConstructor();
    DefaultConstructor constructorObj2 = new DefaultConstructor();
  }
}