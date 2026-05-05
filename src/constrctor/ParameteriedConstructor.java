package constrctor;

public class ParameteriedConstructor {
	public int num;
	
	public String name;
	
	public ParameteriedConstructor() {
		System.out.println("This is default constructor!");
	}
	
	public ParameteriedConstructor(String name, int num) {
//		System.out.println("Name: " + name);
		this.name = name;
		this.num = num;
	}
	
	
	
	public void secoundConstructor() {
		System.out.println("name is : " +  name);
		System.out.println("num is " + num);
	}
	
}
