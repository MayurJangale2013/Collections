package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AccessArrayListElement {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		boolean res = al.add(10);  // return type of add method
		System.out.println("res = " + res);
		al.add(30);
		al.add(40);
		al.add(5);
		al.add(1);

		// access list element using 5 different ways
		
		System.out.println(al);
//		for(int i=0;i<al.size();i++)
//			System.out.print(al.get(i) + ", ");

//		for(Integer x: al)
//			System.out.print(x + ", ");

//		Iterator<Integer> li  = al.iterator();
//		while(li.hasNext())
//			System.out.println(li.next());
		
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		
		System.out.println("-".repeat(40));
		while(li.hasPrevious())
			System.out.println(li.previous());
	}

}
