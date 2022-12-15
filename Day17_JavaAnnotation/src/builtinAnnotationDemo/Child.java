package builtinAnnotationDemo;

public class Child extends parent{
	public String name="Diya";
	//Indicates that a method declaration is intended to override amethod declaration in a supertype. 
	@Override
	public void display()
	{
		super.display();
		System.out.println("Child Name: "+name);
	}	
	
}