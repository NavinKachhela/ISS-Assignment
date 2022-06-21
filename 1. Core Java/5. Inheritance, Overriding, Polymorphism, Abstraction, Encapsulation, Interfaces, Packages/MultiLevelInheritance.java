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

// Intermediatory Class
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

// Derived Class
class Hod extends Teacher {
  private String dept;
  public Hod(int id, String name, String address, double salary, String dept) {
    super(id, name, address, salary);
    this.dept = dept;
  }
  public void show() {

    super.show();
    System.out.println("dept = " + dept);
  }
}

class MultiLevelInheritance {
  public static void main(String[] args) {
    
    Hod hodObj = new Hod(10, "Navin", "Thane", 6000, "comps"); //instantiation ==> creation of object
    hodObj.show();
  }
}