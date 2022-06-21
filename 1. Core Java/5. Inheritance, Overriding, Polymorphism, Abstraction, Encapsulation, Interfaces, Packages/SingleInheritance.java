// Base Class
class Person {
  private int id;
  private String name;
  private String address;

  public Person(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }
  public void show() {
    System.out.println("id = " + id);
    System.out.println("name = " + name);
    System.out.println("address = " + address);
  }

}

// Derived class
class Teacher extends Person {
  private double salary;

  public Teacher(int id, String name, String address, double salary) {
    super(id, name, address);
    this.salary = salary;
  }

  public void show() {
    super.show();
    System.out.println("salary = " + salary);
  }

}

class SingleInheritance {
  public static void main(String[] args) {
    Person personObj = new Person(10, "Navin", "Thane");
    personObj.show();

    Teacher teacherObj = new Teacher(20, "Ajay", "Mumbai", 50000);
    teacherObj.show();
  }
}