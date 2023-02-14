	package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OccurrenceOfStringDemo {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<>();
		String str = "India is my country , India has the largest population and India is a great country";
		String [] tokenArray = str.split(" ");
		for(String x:tokenArray)
		{
			if(map.get(x)==null)
				map.put(x, 1);
				else
				{
					int cnt = map.get(x);
							cnt++;
						map.put(x, cnt);
				}
		}
//		Set<String> ks = map.keySet();
//		Iterator<String> iter = ks.iterator();
//		while(iter.hasNext())
//		{
//			String k = iter.next();
//			 Integer v = map.get(k);
//			 if(v==1)
//				 System.out.println(k + " = " + v); 
//		}
		for(Map.Entry<String, Integer> kv : map.entrySet())
		{
			if(kv.getValue() == 1)
				System.out.println(kv.getKey() + " = " + kv.getValue());
		}
	}

}
