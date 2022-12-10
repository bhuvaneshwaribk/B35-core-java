package exceptionDemo;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsKeywordDemo {
	public static void print(int x) throws IOException
	{
		if(x==1)
		{
			System.out.println("it is equal");
		}
		else
		{
			throw new IOException("IOException occured");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		try 
		{
			print(x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
