package instanceOfDemo;

abstract class Animal
{ 
	 abstract void accept();
}

class Lion extends Animal
{
	@Override
	void accept() {
		
		System.out.println("Lion Roars");
	}
	  
}
public class InstanceOfDemo{
	  public static void main(String[] args) {
		  Lion l=new Lion();
		  l.accept();
		  System.out.println(l instanceof Lion);
		  System.out.println(l instanceof Animal);
	  }
}
