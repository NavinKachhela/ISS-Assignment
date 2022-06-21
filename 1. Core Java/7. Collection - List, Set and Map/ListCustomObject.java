import java.util.*;

// Book class that implements Comparable
class Book implements Comparable <Book> {
  private int bookId;
  private String name;
  private double price;

  Book(int bookId, String name, double price) {
    this.bookId = bookId;
    this.name = name;
    this.price = price;
  }

  public int getBookid() {
    return bookId;
  }
  public void setBookid(int bookId) {
    this.bookId = bookId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(double price) {
    this.price = price;
  }

  public String toString() {
    return bookId + " " + name + " " + price;
  }

  // Used to sort books by bookId in ascending order
  public int compareTo(Book bookObj) {
    return bookId - bookObj.bookId;
  }
}

// Used to sort books by book price in ascending order
class SortAscending implements Comparator < Book > {
  public int compare(Book bookObj1, Book bookObj2) {
    return (int)(bookObj1.getPrice() - bookObj2.getPrice());
  }
}

class ListCustomObject {

  public static void main(String[] args) {
    ArrayList < Book > listObj = new ArrayList < > ();

    Book bookObj1 = new Book(10, "java", 500);
    Book bookObj2 = new Book(50, "android", 400);
    Book bookObj3 = new Book(30, "golang", 600);
    Book bookObj4 = new Book(20, "django", 700);
    Book bookObj5 = new Book(40, "python", 300);

    listObj.add(bookObj1);
    listObj.add(bookObj2);
    listObj.add(bookObj3);
    listObj.add(bookObj4);
    listObj.add(bookObj5);

    for (Book bookObj: listObj)
      System.out.println(bookObj);
    System.out.println();

    Collections.sort(listObj);
    for (Book bookObj: listObj)
      System.out.println(bookObj);
    System.out.println();

    Collections.sort(listObj, new SortAscending());
    for (Book bookObj: listObj)
      System.out.println(bookObj);
    System.out.println();

  }

}