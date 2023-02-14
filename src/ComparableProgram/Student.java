package ComparableProgram;

public class Student {

		int id;
		String name;
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "id=" + id + ", name=" + name;
		}
		
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
	
}
