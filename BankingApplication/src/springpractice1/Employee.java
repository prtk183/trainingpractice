package springpractice1;
//Dependency injection
public class Employee {

	int id;
	String name;
	
	Employee()
	{
		
	}
	
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" "+getId());
		
	}
	
	
	
}
