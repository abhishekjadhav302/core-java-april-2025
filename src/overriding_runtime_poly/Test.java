package overriding_runtime_poly;

public class Test {
	public static void main(String[] args) {
		String str = "Deeloper";
		Employee e;
		
		if(str.equals("Developer")) {
			e = new Developer();
			e.overringCheck();
		} else {
			e = new HR();
			e.overringCheck();
		}

	}
}
