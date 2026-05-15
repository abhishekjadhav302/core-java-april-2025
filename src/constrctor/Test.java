package constrctor;

public class Test {
	
	static int a = 10;

	public static void main(String[] args) {
		
		System.out.println(a);
	
		ParameteriedConstructor nonParaConstructor = new ParameteriedConstructor();
		
		ParameteriedConstructor pc = new ParameteriedConstructor("Abhi", 12);
		pc.secoundConstructor();
	}

}
