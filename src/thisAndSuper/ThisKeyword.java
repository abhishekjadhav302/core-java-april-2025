package thisAndSuper;

//import thisAndSuper.SuperKeyword;

public class ThisKeyword extends SuperKeyword{

	String str1 = "Abhi";
	String str2 = "Kunal";
	
	public ThisKeyword() {
		super();
		
//		this(9561483198L);
	}
	public ThisKeyword(long phoneNo) {
		System.out.println("Phone No: " + phoneNo);
	}
	
	public void check() {
		
//		SuperKeyword sp = new SuperKeyword();
//		super.testSuper();
		System.out.println(this.str1);
	}
	
	
}
