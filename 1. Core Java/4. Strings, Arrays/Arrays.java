class Arrays{
	public static void main(String[] args) {
		// Syntax to define an array
		// datatype var[] = new datatype[size];
		int x[] = new int[10]; //by defaultly initialized to 0
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;

		System.out.println("Array size:- ");
		System.out.println(x.length); // prints the length of array

		// prints elements of array
		System.out.println("Array elements are:- ");
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}