package has_a_relationship;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		Document d = new Document();

		s.setRollno(101);
		s.setFirstName("Abhi");
		s.setLastName("jadhav");
		s.setCity("Satara");
		s.setDoc(d);

		d.setAdharNo("Adhar...");
		d.setLicense("license...");
		d.setPanNo("pan no...");

		System.out.println(s.getRollno());
		System.out.println(s.getFirstName());
		System.out.println(s.getLastName());
		System.out.println(s.getCity());

		System.out.println(s.getDoc().getAdharNo());
		System.out.println(s.getDoc().getLicense());
		System.out.println(s.getDoc().getPanNo());
	}
}
