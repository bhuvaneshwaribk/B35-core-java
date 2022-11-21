package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class ifelseifelse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c)
			System.out.println("a is greater:"+a);
		else if(b>a && b>c)
			System.out.println("b is greater:"+b);
		else
			System.out.println("c is greater:"+c);
	}

}
