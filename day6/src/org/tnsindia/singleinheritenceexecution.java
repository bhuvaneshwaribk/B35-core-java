package org.tnsindia;
import java.util.Scanner;
public class singleinheritenceexecution {

	public static void main(String[] args) {
		System.out.println("enter the name of the animal:");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println(" enter the name of the animal:");
		String breed1=s.nextLine();
        dog d=new dog();
        d.name=name1;
        d.breed=breed1;
        d.display();
        d.print();
        s.close();
	}

}
