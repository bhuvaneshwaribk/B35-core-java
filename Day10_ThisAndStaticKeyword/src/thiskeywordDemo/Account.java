package thiskeywordDemo;

public class Account {
	private long account_no;
	private String account_type;
	
	public void accept(int account_no,String account_type)
	{
		this.account_no=account_no;
		this.account_type=account_type;
	}
	public void display()
	{
		System.out.println("Account No is:"+account_no+" "+"Account type is:"+account_type);
	}

}
