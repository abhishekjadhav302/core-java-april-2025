package collectionIntro;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	List<Integer> ar = new ArrayList<>();

	public void arrayListTest() {
		ar.add(34);
		ar.add(45);

		ar.addAll(ar);

		ar.add(null);

		ar.addLast(23);

		ar.addFirst(88);

//		====================================

//		ar.remove(4); // remove index 4 element
//		ar.removeFirst();
//		ar.removeLast();/
//		ar.removeAll(ar);

//		================================

		System.out.println(ar.get(2)); // take index number as a parameter
		System.out.println(ar.getClass()); // which constructor we have call on that basis getClass() show class name.
		System.out.println(ar.getFirst());
		System.out.println(ar.getLast());
		System.out.println(ar.size());
		System.out.println(ar.contains(88));
		System.out.println(ar.reversed());
		System.out.println(List.of('a', 'b', 'c'));
		System.out.println(ar.iterator());
	}
}
