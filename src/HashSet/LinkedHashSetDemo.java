package HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(100);
		set.add(80);
		set.add(90);
		set.add(70);
		set.add(700);
		set.add(100);
		set.add(null);
		set.add(null);
		
		System.out.println(set); // oder and unique element
	}

}
