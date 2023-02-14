package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class CheckListIsPresent {

	public static void main(String[] args) {
		List<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		List<Integer> al1= new ArrayList<>();
		al1.add(100);
		al1.add(200);
		al1.add(40);
		al1.add(30);
		al1.add(20);
		al1.add(10);
		System.out.println(al1);
		
		List<Integer> al2= new ArrayList<>();
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al1.size();j++)
			{
				if(al.get(i) == al1.get(j))
					al2.add(al.get(i));
			}
		}
		System.out.println("This element are present in the original list => "+al);
		
		
	}

}
