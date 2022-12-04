package superKeywordDemo;
//parent or super class 

public class Animal   
{
	//variable 
   protected String name="wild animal";
   
   //parent constructor
   Animal()
   {
	   System.out.println("parent constructor");

   }
   
   //class
   public void accept()
   {
	   System.out.println("parent class with"+name);
   }
   
}
