package Map;

import java.util.HashMap;
import java.util.Map;

public class MapInitializeDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>(Map.of(
				1,"Virat",
				100,"Rohit",
				20,"Shikhar",
				40,"Hardik"
				));   // max 10 entries are allowed with Map.of
		
		System.out.println(map);
	}

}
