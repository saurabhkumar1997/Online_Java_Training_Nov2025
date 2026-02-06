package onlineJavaPackage;

public class Variable8 {
	int b = 10; // Global varibale
	static int c = 5; // static variable

	public static void d() {
		int e = 15; // Local variable
		System.out.println(e);

	}

	// Non static method

	public void f()

	{
		int g = 11;// Local variable
		System.out.println(g);
	}

	public static void main(String args[]) {
		int a = 6;// Local variable
		System.out.println(a); // calling local variable

		// Static member (without creation of object we can call static method or variable)
		System.out.println(c);
		d();

		// non-static member calling (It is compulsory to create object to call non static method or variable
		Variable8 v1 = new Variable8();
		v1.f();
		System.out.println(v1.b); // calling non static variable

	}

}
