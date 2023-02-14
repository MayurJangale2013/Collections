package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerStudent {

	public static void main(String[] args) {
		List<Student>al = new ArrayList<>();
		Student s1 = new Student(10,"Virat");
		Student s2 = new Student(30,"Surya");
		Student s3 = new Student(60,"Rahul");
		Student s4 = new Student(80,"Mayur");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println(al);
		Collections.sort(al,new idSortAsc());
		System.out.println(al);	
	}

}
