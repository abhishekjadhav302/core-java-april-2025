package interface_practice;

public class SchoolAdmission {

	public static void main(String[] args) {

		MathsTeacher sp = new StudentParent();
		sp.advantage(55);
//		averagescore = MathsTeacher.averageScore;
		System.out.println(sp.averageScore);

		// ============================
		EnglishTeacher et = new StudentParent();
		et.advantage1(45);
		System.out.println(et.averageScore);

		// ==================================
		System.out.println(StudentParent.averageScore);
	}
}
