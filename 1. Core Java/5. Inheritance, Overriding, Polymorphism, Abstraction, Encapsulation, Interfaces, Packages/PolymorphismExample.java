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

class Student extends Person {
  private String branch;

  Student(int id, String name, String address, String branch) {
    super(id, name, address);
    this.branch = branch;

  }
  public void show() {
    super.show();
    System.out.println("Student branch = " + branch);
  }
}

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

class PolymorphismExample {
  public static void main(String[] args) {
    Person personObj = new Person(10, "Vipul", "Nagpur");
    Person teacherObj = new Teacher(20, "Ajay", "Mumbai", 50000);
    Person studentObj = new Student(30, "Navin", "Thane", "comps");

    personObj.show();
    teacherObj.show();
    studentObj.show();
  }
}