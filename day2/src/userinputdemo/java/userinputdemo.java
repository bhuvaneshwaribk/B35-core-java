package userinputdemo.java;

import java.util.Scanner;

public class userinputdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
     System.out.println("enter the number:");
     int x=s.nextInt();
     System.out.println("enter the number:");
     float y=s.nextFloat();
     System.out.println("enter the number:");
     char c=s.next().charAt(0);
     System.out.println("enter the number:");
     String str=s.next();
     System.out.println("the intger is:"+x);
     System.out.println("the float is:"+y);
     System.out.println("the charcter is:"+c);
     System.out.println("the string is:"+str);
     s.close();



   }

}
