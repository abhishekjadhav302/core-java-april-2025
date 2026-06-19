package interface_practice;

public class StudentParent implements MathsTeacher, EnglishTeacher {

	static Integer averageScore = 35;

//	@Override
	public void advantage(Integer averageScore) {
		System.out.println("Maths score: " + averageScore);

	}

//	@Override
	public void advantage1(Integer averageScore) {
		System.out.println("English score: " + averageScore);
	}

}
