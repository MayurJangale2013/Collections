package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerEmp {

	public static void main(String[] args) {
		List <Emp> al = new ArrayList<>();
		
		Emp e1 = new Emp(100,"Virat");
		Emp e2 = new Emp(10,"Hardik");
		Emp e3 = new Emp(90,"Sachin");
		Emp e4 = new Emp(80,"Kapil");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println("Original List : "+al);
		Collections.sort(al);
		System.out.println("Sorted List : "+al);
	}

}
