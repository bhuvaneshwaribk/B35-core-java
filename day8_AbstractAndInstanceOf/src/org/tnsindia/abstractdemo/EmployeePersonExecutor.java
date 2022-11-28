package org.tnsindia.abstractdemo;

public class EmployeePersonExecutor {

	public static void main(String[] args) {
		person p1=new employee("bhuvana","female",23);
		person p2=new employee("bhuvan","male",-3);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();

	}

}
