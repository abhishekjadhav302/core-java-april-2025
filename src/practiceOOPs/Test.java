package practiceOOPs;

public class Test {
	
	public static void main(String[] args) {
		Encapsulation1 en = new Encapsulation1();
		Inherit_Child1 child = new Inherit_Child1();
		
//		en.setNumMethod(23);
//		en.setNameMethod("Abhi");
//		en.setCheck(true);
//		
//		System.out.println(en.getNumMethod());
//		System.out.println(en.getNameMethod());
//		System.out.println(en.getCheck());
		//--------------------
		
		child.testParentClass();
		child.testParentClass(34);
		
	}
}
