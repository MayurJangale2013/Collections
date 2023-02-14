package FeaturesOFArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>(List.of(1,2,3,4));
		al.add(5);
		System.out.println(al);
		Integer i = 5;
		boolean res = al.remove(i);
		System.out.println(res);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.add(100);
		System.out.println(al);
		
		List<Integer> al1= new ArrayList<>(List.of(40,30,60,20));
		System.out.println("al => " + al);
		System.out.println("al1 => " +  al1);
		al.add(600);
		al.add(500);
		al.add(1000);
//		al.addAll(al1); // appends at the end of al list
		al.addAll(1,al1);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		
		al.add(100);
		System.out.println(al);
		System.out.println("100 occurrs n time: " +Collections.frequency(al,100));
		
		System.out.println(al.contains(1000));
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		System.out.println(al.containsAll(al1));
		
		Object [] arr = al.toArray();
		for(Object x:arr)
		{
			System.out.println(x);
		}
	}

}
