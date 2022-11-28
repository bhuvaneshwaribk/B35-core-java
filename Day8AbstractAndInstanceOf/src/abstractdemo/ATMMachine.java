package abstractdemo;
//abstract class
 abstract class ATMMachine {
	//abstract method
		abstract void withdraw();
		//non abstract method
		void display()
		{
			System.out.println("Non-Abstract method");
		}

}
