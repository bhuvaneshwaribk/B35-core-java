package userinputdemo.java;

import java.util.Scanner;

public class stringinputdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s= new Scanner(System.in);
	    System.out.println("enter the str:");
	    String str=s.nextLine();	    
	    String str1=s.next();
	    
	    System.out.println("the string is:"+str);
	    System.out.println("the string is:"+str1);
	    s.close();
	}

}
