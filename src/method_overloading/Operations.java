package method_overloading;

public class Operations { // 5 inputs

	// addition
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void sum(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	public void sum(int a, int b, int c, int d, int e) {
		System.out.println(a + b + c + d + e);
	}

	// subtract
	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void sub(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	public void sub(int a, int b, int c, int d) {
		System.out.println(a - b - c - d);
	}

	public void sub(int a, int b, int c, int d, int e) {
		System.out.println(a - b - c - d - e);
	}

	// multiply
	public void mul(int a, int b) {
		System.out.println(a * b);
	}

	public void mul(int a, int b, int c) {
		System.out.println(a * b * c);
	}

	public void mul(int a, int b, int c, int d) {
		System.out.println(a * b * c * d);
	}

	public void mul(int a, int b, int c, int d, int e) {
		System.out.println(a * b * c * d * e);
	}

	// divide
	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public void div(int a, int b, int c) {
		System.out.println(a / b / c);
	}

	public void div(int a, int b, int c, int d) {
		System.out.println(a / b / c / d);
	}

	public void div(int a, int b, int c, int d, int e) {
		System.out.println(a / b / c / d / e);
	}
}
