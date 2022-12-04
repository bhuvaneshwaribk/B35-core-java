package finalKeywordDemo;

public class FinalMethodWithChild extends FinalMethodWithParent {
	
	public String pan_no;
	/*
	 * if we use final keyword with any method then we can notoverride
	 */
	
	//method override
	/*public void print()
	{
		System.out.println("Pan no is:"+pan_no);
		super.print();
	}
	*/
	//method overloading
	public void print(String pan_no)
	{
		System.out.println("Pan no is:"+pan_no);
	}

}
