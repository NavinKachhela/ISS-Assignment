class Employee {
  // private variables declared
  private int employeeId;
  private String name;
  private double salary;


  //getter method for employeeId
  public int getEmployeeId() {
    return employeeId;
  }

  // getter method for name 
  public String getName() {
    return name;
  }

  //getter method for salary
  public double getSalary() {
    return salary;
  }

  // setter method for employeeId
  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  // setter method for name  
  public void setName(String name) {
    this.name = name;
  }

  // setter method for salary 
  public void setSalary(double salary) {
    this.salary = salary;
  }

}

class EncapsulationExample {
  public static void main(String[] args) {
    Employee employeeObj = new Employee();

    // setting values of the variables
    employeeObj.setEmployeeId(10);
    employeeObj.setName("Navin");
    employeeObj.setSalary(10000);

    // Displaying values of the variables
    System.out.println("Employee Id: " + employeeObj.getEmployeeId() + " Employee Name: " + employeeObj.getName() + " Employee Salary: " + employeeObj.getSalary());
  }
}