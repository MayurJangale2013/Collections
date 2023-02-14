package HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InitializatioOfSet {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>(List.of(1,2,3,4,5));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(1,2,3));
		
		List<Integer> l = new ArrayList(List.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5));
		Set<Integer> s3 = new HashSet<>(l);
		System.out.println("s3 =>"+s3);
		
		s1.removeAll(s2); // s1-s2
		System.out.println("After remove all "+s1);
		
		s1.retainAll(s2);// common elements between s1 & s2 is 1 2 3
		System.out.println("After retain all : "+s1);
		
		System.out.println(s1.isEmpty());	
	}

}
