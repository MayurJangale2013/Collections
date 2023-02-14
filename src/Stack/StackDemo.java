package Stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		
		System.out.println(s); // [100, 200, 300, 400]
		System.out.println(s.peek()); // Point out to last value as 400
		
		System.out.println(s.pop());// take out same value from array as 400
		
		System.out.println(s); // Now value in array is [100,200,300]
		
	}

}
