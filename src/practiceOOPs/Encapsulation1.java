package practiceOOPs;

public class Encapsulation1 {
	/*
	 * Encapsulation works only on variable data.
	 * In encapsulation we only can initialize and access values by getter and setter methods
	 * encapsulation is not work on methods
	 */
	
	private int num;
	
	private String name;
	
	private boolean check;
	
	private void paraMethod() {
		System.out.println("void method");
	}
	
	//----------------------
	public void setNumMethod(int num) {
		this.num = num;
	}
	public int getNumMethod() {
		paraMethod();
		return num;
	}
	//-----------------------------
	public void setNameMethod(String name) {
		this.name = name;
	}
	public String getNameMethod() {
		return name;
	}
	//--------------------------
	public void setCheck(boolean check) {
		this.check = check;
	}
	public boolean getCheck() {
		return check;
	}
}
