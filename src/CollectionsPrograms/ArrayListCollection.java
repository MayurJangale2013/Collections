package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		List al = new ArrayList<>();
		int sum=0;
		al.add(10);
		al.add(null);
		al.add(true);
		al.add(40);
		
		System.out.println("Size of Array : "+al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		// order is maintained
		// duplicates are allowed
		// null allowed
		
	}

}
