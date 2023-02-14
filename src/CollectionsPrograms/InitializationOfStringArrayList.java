package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class InitializationOfStringArrayList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>()
		{
			{
				add("Virat");
				add("Shikhar");
				add("Surya");
				add("Ruturaj");
				add("Sachin");
			}	
		};
		for(String x:al)
		{
			System.out.println(x);
		}
		System.out.println("=".repeat(40));
		for(int i = al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
	}

}
