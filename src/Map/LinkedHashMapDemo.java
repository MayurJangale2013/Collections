package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>map = new LinkedHashMap<>();
		map.put(100, "Virat");
		map.put(1, "Rohit");
		map.put(7, "Ronaldo");
		map.put(4, "Messi");
		map.put(2, "Trump");
		System.out.println(map);
		
		
	}

}
