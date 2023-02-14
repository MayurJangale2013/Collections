package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer>al = new ArrayList<>(List.of(10,20,30,40,50));
		al.add(60);
		System.out.println(al);
	}

}
