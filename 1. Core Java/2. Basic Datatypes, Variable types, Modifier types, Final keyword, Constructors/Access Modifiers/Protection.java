package pack1;

public class Protection {
	private int pri_var = 1;
	int var = 2;
	protected int pro_var = 3;
	public int pub_var = 4;

	public Protection() {
		System.out.println("Inside Protection");
		System.out.println("pri_var = " + pri_var);
		System.out.println("var = " + var);
		System.out.println("pro_var = " + pro_var);
		System.out.println("pub_var = " + pub_var);
	}
}