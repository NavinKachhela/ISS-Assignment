import java.util.*;
class MapExample {
	public static void main(String[] args) {
		// Creating an empty HashMap
        Map<String, Integer> hashMapObj = new HashMap<String, Integer>();
		
		//Inserting pairs using put() method in map

		hashMapObj.put("A", 100);
		hashMapObj.put("B", 200);
		hashMapObj.put("C", 300);
		hashMapObj.put("D", 400);
		hashMapObj.put("E", 500);

		System.out.println("Iterating over Map");
		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> mapEntry : hashMapObj.entrySet()) {
            // Printing keys
            System.out.print(mapEntry.getKey() + ":");
            System.out.println(mapEntry.getValue());
        }

        hashMapObj.put("B", 1000);
        System.out.println("Updated Map " + hashMapObj);

        hashMapObj.remove("B");
        System.out.println("Element removed " + hashMapObj);

	}
}