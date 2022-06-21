import java.util.ArrayList;
class ArrayListExample {
  public static void main(String[] args) {
    //Declaring ArrayList
    ArrayList <Integer> arrayListObj1 = new ArrayList <Integer>();
    ArrayList <Integer> arrayListObj2 = new ArrayList <Integer>();

    // Appending new elements at the end of the list 
    arrayListObj1.add(10);
    arrayListObj1.add(20);
    arrayListObj1.add(30);
    arrayListObj1.add(40);
    arrayListObj1.add(50);
    arrayListObj1.add(60);

    System.out.println("ArrayList 1 size = " + arrayListObj1.size()); // printing ArrayList size
    System.out.println(arrayListObj1); // Printing elements
    System.out.println("2nd Element removed");
    arrayListObj1.remove(1); // remove element at index 1
    System.out.println(arrayListObj1);
    System.out.println("Element added at index 1");
    arrayListObj1.set(1, 90); // replace the specified element in the list, present at the specified position.
    System.out.println(arrayListObj1);
    System.out.println("ArrayList 1 contains 90 = " + arrayListObj1.contains(90)); // Returns true if this list contains the specified element.
    System.out.println("ArrayList 1 is Empty = " + arrayListObj1.isEmpty()); // Returns true if this list contains no elements.
    System.out.println("Element 90 present on which index = " + arrayListObj1.indexOf(90)); // index of first occurrence of a specific element is either returned, or -1
    System.out.println("Copy all ArrayList 1 elements to ArrayList 2");
    arrayListObj2.addAll(0, arrayListObj1); //  insert all of the elements starting at the specified position from a specific collection into the mentioned list
    System.out.println("ArrayList 2 = " + arrayListObj2);
    System.out.println("Iterating over ArrayList");
    for (int index = 1; index < arrayListObj1.size(); index++) {
      System.out.print(arrayListObj1.get(index) + " ");
    }

  }
}