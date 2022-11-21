package loopingstatement;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		int i=1;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(i<=5)
		{
			System.out.println("welcome"+i);
			i++;
		}
	}

}
