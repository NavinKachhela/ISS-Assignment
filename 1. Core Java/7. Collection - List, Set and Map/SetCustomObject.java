import java.util.*;

// Book class that implements Comparable
class Book implements Comparable<Book> {
	private int bookId;
	private String name;
	private double price;

	Book(int bookId, String name, double price){
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
	public String getName(){
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
	public int compareTo(Book bookObj){
		return bookId - bookObj.bookId;
	}
}

// Used to sort books by book price in ascending order
class SortDescending implements Comparator<Book>{
	public int compare(Book bookObj1, Book bookObj2){
		return (int)(bookObj1.getPrice() - bookObj2.getPrice());
	}
}

class SetCustomObject {

	public static void main(String[] args) {

		Set<Book> setObj1 = new TreeSet<Book>();
		Set<Book> setObj2 = new TreeSet<Book>(new SortDescending());

		Book bookObj1 =   new Book(10, "java", 500); 	
		Book bookObj2 =   new Book(50, "android", 400);
		Book bookObj3 =   new Book(30, "golang", 600);
		Book bookObj4 =   new Book(20, "django", 700);
		Book bookObj5 =   new Book(40, "python", 300);

		setObj1.add(bookObj1);	
		setObj1.add(bookObj2);
		setObj1.add(bookObj3);
		setObj1.add(bookObj4);
		setObj1.add(bookObj5);

		setObj2.add(bookObj1);	
		setObj2.add(bookObj2);
		setObj2.add(bookObj3);
		setObj2.add(bookObj4);
		setObj2.add(bookObj5);

		System.out.println("Sorted using Book Id");
		for(Book bookObj :setObj1)
			System.out.println(bookObj);
		System.out.println();

		System.out.println("Sorted using Book price");
		for(Book bookObj :setObj2)
			System.out.println(bookObj);
		System.out.println();

	}
	

}