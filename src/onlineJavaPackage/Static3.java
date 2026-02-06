package onlineJavaPackage;

public class Static3 {
	int roll; //global variable
	String name; //Global Varibale
	static String college= "IIT Bombay"; // static variable
	
	//non static method
	public void getresult(int r, String n) {
		roll=r;
		name=n;
		
		System.out.println(roll + " " + name + " " + college );
		
	}
	
	public static void main (String args[]) {
		
		Static3 s3 = new Static3();
		s3.getresult(1, "John"); // 1 John IIT Bombay
		s3.getresult(2, "peter");// 2 Peter IIT Bombay

		
		
	}

}
