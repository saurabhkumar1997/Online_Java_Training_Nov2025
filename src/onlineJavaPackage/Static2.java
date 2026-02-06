package onlineJavaPackage;

public class Static2 {
	
	static int roll; //Declaring static variable
	static String name; //Deckaring static variable
	String college = "IIM Indore"; //Defining Global Variable
	int a =10; //Defining global variable
	
	public static void main(String[] args) {
		Static2 s2= new Static2();
		System.out.println(roll);
		System.out.println(name);
		System.out.println(s2.college); //non static variable thats why we user s2.
		System.out.println(s2.a);
		
	}

}
