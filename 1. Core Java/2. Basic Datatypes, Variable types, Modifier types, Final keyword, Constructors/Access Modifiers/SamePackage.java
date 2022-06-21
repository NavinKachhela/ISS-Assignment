package pack1;

public class SamePackage {
	SamePackage() {
		Protection protectionObj = new Protection();
		System.out.println("Inside Same Package");
		//System.out.println("protectionObj.pri_var" + protectionObj.pri_var);
		System.out.println("protectionObj.var = " + protectionObj.var);
		System.out.println("protectionObj.pro_var = " + protectionObj.pro_var);
		System.out.println("protectionObj.pub_var = " + protectionObj.pub_var);
	}	
}