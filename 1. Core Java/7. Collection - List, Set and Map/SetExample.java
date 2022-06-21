import java.util.*;
class SetExample {
	public static void main(String[] args) {
		// Creating an object of Set class 
        // Declaring object of Integer type 
		Set<Integer> setObject1 = new HashSet<Integer>();


		// Adding elements to Set
		setObject1.add(1);
		setObject1.add(3);
		setObject1.add(2);
		setObject1.add(4);
		setObject1.add(8);
		setObject1.add(9);
		setObject1.add(0);

		// Creating an object of Set class 
        // Declaring object of Integer type
		Set<Integer> setObject2 = new HashSet<Integer>();
		setObject2.add(1);
		setObject2.add(3);
		setObject2.add(7);
		setObject2.add(5);
		setObject2.add(4);
		setObject2.add(0);
		setObject2.add(7);
		setObject2.add(5);

		System.out.println("Set 1 = " + setObject1);
		System.out.println("Set 2 = " + setObject2);

		// To find union
        Set<Integer> union = new HashSet<Integer>(setObject1);
        union.addAll(setObject2);
        System.out.print("Union of the two Set");
        System.out.println(union);
  
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(setObject1);
        intersection.retainAll(setObject2);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
  
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(setObject1);
        difference.removeAll(setObject2);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
		

	}
}