package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> Hs = new HashSet<>();
		// unorder, unique set of elements
		boolean res = Hs.add(100);
		System.out.println(res);
		res = Hs.add(300);
		System.out.println(res);
		res = Hs.add(400);
		System.out.println(res);
		res = Hs.add(500);
		System.out.println(res);
		res = Hs.add(200); // duplicates value not allowed
		System.out.println(res);
		
		res = Hs.add(200);
		System.out.println(res);
		System.out.println(Hs);
		System.out.println("=".repeat(40));
		for(Integer x : Hs)
		System.out.println(x);
		
	}

}
