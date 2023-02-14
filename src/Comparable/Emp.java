package Comparable;

public class Emp implements Comparable<Emp> {
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
		return "id=" + id + ", name=" + name ;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Emp o) {
		if(this.getId() < o.getId())
		return 1;
		else if(this.getId()>o.getId())
			return -1;
		else
			return 0;
	}
}
