package exceptionDemo;

public class DemoOnThrowKeyword {
	@SuppressWarnings("unused")
	private String contents;
	public void display(String contents)
	{
		this.contents=contents;
		if(contents.isEmpty())
		{
			throw new NullPointerException("contents is empty");
		}
		else
		{
			System.out.println("contents are:"+contents);
		}
	}

	
	

}
