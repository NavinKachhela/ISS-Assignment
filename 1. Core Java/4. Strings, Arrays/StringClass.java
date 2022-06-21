class StringClass {
	public static void main(String[] args) {
		byte byteArray[] = {65, 66, 97, 98, 99};
		char characterArray[] = {'N', 'A', 'V', 'I', 'N'};
		
		//Types of constructors in string class
		String stringObject1 = new String();
		String stringObject2 = new String(characterArray);
		String stringObject3 = new String(characterArray, 2, 3);
		String stringObject4 = new String(stringObject2);
		String stringObject5 = new String(byteArray);
		String stringObject6 = new String(byteArray, 2, 3);

		//Types of functions

		System.out.println("string2: " + stringObject2);
		System.out.println("string2 Length: " + stringObject2.length());
		System.out.println("string2 3rd Character: " + stringObject2.charAt(2));
		System.out.println("string2 is equal to string5: " + stringObject1.equals(stringObject5));
		System.out.println("string2 is equal string3: " + stringObject2.equalsIgnoreCase(stringObject4));
		System.out.println("string2 and 'navin' difference: " + stringObject2.compareTo("navin"));
		System.out.println("string2 index of V: " + stringObject2.indexOf('V'));
		System.out.println("string2 substring: " + stringObject2.substring(0,3));
		System.out.println("string2 in lowercase: " + stringObject2.toLowerCase());


	}
}