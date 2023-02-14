package HashSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(100);
		set.add(10);
		set.add(80);
		set.add(25);
		set.add(55);
		set.add(90);
		System.out.println(set);// set - ASC order + unique = tree set
		
	}
}
