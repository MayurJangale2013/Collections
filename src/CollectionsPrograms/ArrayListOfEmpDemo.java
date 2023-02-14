package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfEmpDemo {

	public static void main(String[] args) {
	List <Emp> empList = new ArrayList<>();
	Emp e1 = new Emp(10,"Virat"); // object of constructor
	Emp e2 = new Emp(20,"Anushka");
	Emp e3 = new Emp(10,"Surya");
	Emp e4 = new Emp(10,"Chahal");
	
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	System.out.println(empList);
	for(Emp x:empList)
	{
		System.out.println(x);
	}
	
		
	}

}
