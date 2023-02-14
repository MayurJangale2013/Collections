package Map;

import java.util.Map;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String>  map = new HashMap<>();
		map.put(100,"Virat");
		map.put(80,"Rohit");
		map.put(70,"Shikhar");
		map.put(50,"Hardik");

		System.out.println(map.get(100)); // Virat
		System.out.println(map.get(80));// Rohit
		System.out.println(map.get(500)); // null
		
		map.put(100, "Kohli");
		map.put(null, "null");
		map.put(null, "null1");
		map.put(200, "null");
		map.put(300, "null");
		System.out.println(map);
	}

}
