package builtinAnnotationDemo;

import java.util.Scanner;

public class DeprecatedDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		//A program element annotated @Deprecated is one that programmers are discouraged from using.
		@Deprecated
		int x=s.nextInt();
		System.out.println(x);
		s.close();

	}

}