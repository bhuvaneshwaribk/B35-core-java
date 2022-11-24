package orgtnsindia.constructordemo;

public class employe {
	public int salary;
	public String name;
	employe()
	{
		System.out.println("default constructor");
	}
	public employe(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		
	}
	public void print() {
		System.out.println("salary of "+name+" is: "+salary);
	}
	

}
