package pack2;

public class OtherPackage {
	OtherPackage() {
		pack1.Protection protectionObj = new pack1.Protection();
		System.out.println("Inside OtherPackage");
		//System.out.println("pri_var = " + protectionObj.pri_var);
		//System.out.println("var = " + protectionObj.var);
		//System.out.println("pro_var = " + protectionObj.pro_var);
		System.out.println("pub_var = " + protectionObj.pub_var);
	}
}