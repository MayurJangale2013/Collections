package CollectionsPrograms;

import java.util.ArrayList;    
import java.util.List;

public class InitializationOfIntegerArrayList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>(List.of(10,20,30,40,50));
		al.add(60);
		for(Integer x:al)
		{
			System.out.println(x);
		}
		System.out.println("=".repeat(40));
		List<Integer> al1 = new ArrayList<>()
		{
			{
				add(10);
				add(20);
				add(30);
				add(40);
				add(50);
			}	
		};
		System.out.println(al1);
		List<Integer> al2 = new ArrayList<>()
		{
			{
				add(10);
				add(20);
				add(30);
				add(40);
				add(50);
			}	
		};
		System.out.println("al1.hashCode() "+al1.hashCode());
		System.out.println("al2.hashCode() "+al2.hashCode());
		
		if(al1==al2)
			System.out.println("al1==al2");
		else
			System.out.println("al1 != al2");
		
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum = sum + al.get(i);
		}
		System.out.println("Sum is : "+sum);
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
				
	}

}
