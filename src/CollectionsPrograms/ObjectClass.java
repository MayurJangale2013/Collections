package CollectionsPrograms;

public class ObjectClass {

	public static void main(String[] args) {
		Object [] objArr = new Object [5];
		objArr [0] = 1;
		objArr [1] = 1.2f;
		objArr [2] = 11.22;
		objArr [3] = 'a';
		objArr [4] = "Mayur";
		
		for(Object x:objArr)
		{
			System.out.println(x + " ");
		}
		
	}

}
