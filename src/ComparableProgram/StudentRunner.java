package ComparableProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		Student s1 = new Student(100,"Virat");
		Student s2 = new Student(400,"Kapil");
		Student s3 = new Student(200,"Hardik");
		Student s4 = new Student(300,"Surya");
		
		System.out.println(s1);//this will give a call to s1.toString() automatically
		
		List<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Original List" + al);
//		Collections.sort(al, new idSortAsc());
//		System.out.println("Sorted List - Id " + al);

//		Collections.sort(al,new idSortDesc()); // anonymous class
//		System.out.println("Sorted List- Id "+al);
		
//		Collections.sort(al,new NameSortAsc());
//		System.out.println("Sorted List- Id "+al);
		
		Collections.sort(al,new NameSortDesc());
		System.out.println("Sorted List- Id "+al);

	}

}
