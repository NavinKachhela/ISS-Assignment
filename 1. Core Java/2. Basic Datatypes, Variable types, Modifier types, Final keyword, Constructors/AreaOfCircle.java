/*
This program implements an application to illustrate the use of variable types,
modifier types,final keyword
*/
class AreaOfCircle {
  private double radius; // instance variable  --> seperate copy for each object 
  private static final double PI = 3.14159; // static variable --> single copy for all objects

  //Sets the radius param of circle
  public void setData(double radius) {
    this.radius = radius;
  }
  //printing the radius of circle
  public void showData() {
    System.out.println("radius = " + radius);
  }
  //This method calculates the area of circle
  public void area() {
    double ans = PI * radius * radius; // local variable --> defined in the method
    System.out.println("area = " + ans);
  }
  public static void main(String[] args) {
    AreaOfCircle CircleObj = new AreaOfCircle();
    CircleObj.setData(5.6);
    CircleObj.showData();
    CircleObj.area();
  }
}