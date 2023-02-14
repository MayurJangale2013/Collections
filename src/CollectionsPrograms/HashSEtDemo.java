package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSEtDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(null);
		System.out.println(set);
		
//		for(Integer x:set)
//		{
//			System.out.println(x);
//		}
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		System.out.println("al: " + al);
		
		Set<Integer> set1 = new HashSet<>(al);
		System.out.println("set1 : " + set1);
		
		System.out.println(set.getClass());
		
	}

}
