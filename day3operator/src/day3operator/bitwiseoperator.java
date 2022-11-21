package day3operator;

import java.util.Scanner;

public class bitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a= s.nextInt();
		int b=s.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(b>>1);
		System.out.println(b<<1);
		s.close();

	}

}
