package CollectionsPrograms;

public class Emp {
	int id;
	String name;
	Emp(int id,String name)
	{
		this.id = id;
		this.name= name;
	}
	@Override
	public String toString() {
		return "id = "+id+" , name = "+name;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}

