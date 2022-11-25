package org.tnsindia;
import java.util.Scanner;
public class MultiLevelInheritence {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    System.out.println("enter vehicle name is :");
    String veh_name=s.nextLine();
    Tyre t= new Tyre();
    t.setName(veh_name);
    t.display();
    
    System.out.println("enter brand name is :");
    String brand=s.nextLine();
    t.setName(brand);
    t.display();
    
    System.out.println("enter Tyre name is :");
    String Tyre_name=s.nextLine();
    t.setName(Tyre_name);
    t.display();
    s.close();
	}

}
