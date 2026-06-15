package mainMethod_overloading;

public class MainClass {
	String a;
	int b;
	
	public static void main( int a)  {	
		System.out.println("This is MainClass method first.." + a);
		}
	public static int main(String a, int b) {
		System.out.println("This is MainClass method second.. a and b: " + a);
		return 0;
	}
	}
