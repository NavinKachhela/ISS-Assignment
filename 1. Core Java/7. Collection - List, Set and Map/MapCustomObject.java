import java.util.*;

// Book class that implements Comparable
class Book implements Comparable < Book > {
  private String name;
  private double price;

  Book(String name, double price) {
    this.name = name;
    this.price = price;
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
    return name + " " + price;
  }

  // Used to sort books by book price in ascending order
  public int compareTo(Book bookObj) {
    return (int)(price - bookObj.price);
  }
}

// Used to sort books by book name in ascending order
class SortDescending implements Comparator < Book > {
  public int compare(Book bookObj1, Book bookObj2) {
    return bookObj1.getName().compareTo(bookObj2.getName());
  }
}

class MapCustomObject {

  public static void main(String[] args) {

    Map <Book, Integer> mapObj1 = new TreeMap <Book, Integer>();
    Map <Book, Integer> mapObj2 = new TreeMap <Book, Integer>(new SortDescending());

    Book bookObj1 = new Book("java", 500);
    Book bookObj2 = new Book("android", 400);
    Book bookObj3 = new Book("golang", 600);
    Book bookObj4 = new Book("django", 700);
    Book bookObj5 = new Book("python", 300);

    mapObj1.put(bookObj1, 10);
    mapObj1.put(bookObj2, 20);
    mapObj1.put(bookObj3, 30);
    mapObj1.put(bookObj4, 40);
    mapObj1.put(bookObj5, 50);

    mapObj2.put(bookObj1, 10);
    mapObj2.put(bookObj2, 20);
    mapObj2.put(bookObj3, 30);
    mapObj2.put(bookObj4, 40);
    mapObj2.put(bookObj5, 50);

    System.out.println("Sorted using Book Price");
    for (Map.Entry < Book, Integer > entrySet: mapObj1.entrySet()) {
      System.out.println("Key = " + entrySet.getKey() + ", Value = " + entrySet.getValue());
    }
    System.out.println();

    System.out.println("Sorted using Book Name");
    for (Map.Entry < Book, Integer > entrySet: mapObj2.entrySet()) {
      System.out.println("Key = " + entrySet.getKey() + ", Value = " + entrySet.getValue());
    }

  }

}