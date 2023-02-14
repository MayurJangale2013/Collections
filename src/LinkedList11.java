import java.util.LinkedList;
import java.util.List;

public class LinkedList11 {

	public static void main(String[] args) {
		List<Integer> ll= new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		
		System.out.println(ll);
		System.out.println(ll.add(500));
		System.out.println(ll);
		
		Integer o=100;
		boolean res = ll.remove(o);
		System.out.println(res);
		System.out.println(ll);
		ll.add(0,100);
		System.out.println(ll);
		
		
	}

}
