package CollectionsPrograms;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al = new ArrayList<>();
		al.add(10);
		al.add(20);
		System.out.println("al.size : "+ al.size());
		System.out.println(al);
		al.add(0,5);
		System.out.println("al.size : "+ al.size());
		System.out.println(al);
		al.add(30);
		System.out.println("al.size : "+ al.size());
		System.out.println(al);
		System.out.println(al.get(0));
		
		
	}

}
