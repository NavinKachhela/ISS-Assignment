package pack1;

public class Derived extends Protection {
	Derived() {
		System.out.println("Inside Derived");
		//System.out.println("pri_var" + pri_var);
		System.out.println("var = " + var);
		System.out.println("pro_var = " + pro_var);
		System.out.println("pub_var = " + pub_var);
	}
}