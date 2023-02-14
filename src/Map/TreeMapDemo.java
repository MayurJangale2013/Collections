package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(10, "Virat");
		map.put(1, "Rohit");
		map.put(7, "Ronaldo");
		map.put(4, "Messi");
		map.put(2, "Trump");
		
		System.out.println(map);
	}

}
