package onlineJavaPackage;

public class Static1 {

	int x = 100; // Global variable
	String s = "hello"; // Global
	static int y = 200; // Static Variable

	// Static Method
	public static void method1() {
		String x = "Hello"; // Local variable
		System.out.println(x); // calling x local variable

	}

	// non static method
	public void method2() {
		int i = 100; // local variable
	}

}
