//Base Class
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

// derived class 1
class Student extends Person {
  private String branch;

  Student(int id, String name, String address, String branch) {
    super(id, name, address);
    this.branch = branch;

  }
  public void show() {
    super.show();
    System.out.println("Student branch = " + branch  + "\n");
  }
}

// derived class 2
class Teacher extends Person {
  private double salary;

  public Teacher(int id, String name, String address, double salary) {
    super(id, name, address);
    this.salary = salary;
  }

  public void show() {
    super.show();
    System.out.println("salary = " + salary + "\n");
  }

}

// derived class 3
class Hod extends Person{
  private String dept;
  public Hod(int id, String name, String address, String dept) {
    super(id, name, address);
    this.dept = dept;
  }
  public void show() {
    super.show();
    System.out.println("dept = " + dept + "\n");
  }
}

class HierarchicalInheritance {
  public static void main(String[] args) {
    Teacher teacherObj = new Teacher(20, "Ajay", "Mumbai", 50000);
    teacherObj.show();

    Student studentObj = new Student(30, "Navin", "Thane", "comps");
    studentObj.show();

    Hod hodObj = new Hod(10, "vipul", "Thane", "comps"); //instantiation ==> creation of object
    hodObj.show();
  }
}