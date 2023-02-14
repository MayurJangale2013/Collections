package Map;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfStringDemo1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		String str = "India is my country , India has the largest population and India is a great country";
		String [] tokenArray = str.split(" ");
		for(String x: tokenArray) {
			if(map.get(x)==null)
				map.put(x, 1);
			else {
				int cnt = map.get(x);
				map.put(x, cnt);
			}
		}
		for(Map.Entry<String, Integer>kv : map.entrySet()) {
			if(kv.getValue()==1)
				System.out.println(kv.getKey()+" "+kv.getValue());
		}
	}

}
