package CollectionsPrograms;

import java.util.ArrayList;

public class ArrayRemoveAndADD {

	public static void main(String[] args) {
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(500);
		al2.add(5000);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);  //0 
		al.add(20);  // 1
		al.add(30);  // 2
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		al.add(1,100);
		System.out.println(al);
//		al.addAll(0, al2);
		al.addAll(al.size(),al2);
		
		System.out.println(al);
		System.out.println("=".repeat(40));
		
		Integer i = al.remove(0);
		System.out.println(i); // 10
		System.out.println(al);
		System.out.println("+++++++");
		Integer o = 100;
	    boolean res = al.remove(o);
		System.out.println(res);
		System.out.println(al);
		System.out.println("=".repeat(40));
		o = 200;
		res = al.remove(o);
		System.out.println(res);
		System.out.println(al);
		System.out.println("=".repeat(40));
		Integer pEle = al.set(1, 300);
		System.out.println(pEle); //30
		System.out.println(al);
		al.set(1, 100);
		System.out.println(al);
	}

}
