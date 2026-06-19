package collectionIntro;

import java.util.LinkedList;
import java.util.List;

public class Zomato {
//	int num;

	List<Object> l = new LinkedList<>();

	public String check() {
//		this.num = num;
//		System.out.println(((Object) num).getClass());
//		System.out.println(num);

		l.add(34);
		l.add(true);
		l.add("String check");
		l.add(34);
		l.add(2, 34.43);
		l.add("ee");

//		for (Object i : l) {
		System.out.println(l);
//		}
		return "test";

	}

//	public int numCheck() {
//		return num;
//	}

}
