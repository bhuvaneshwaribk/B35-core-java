package org.tnsindia;
//child class of vehicle
public class BMW extends vehicle {
	private String name1;
	 public void display1()
	 {
		 System.out.println("vehicle name is :"+name1);
	 }
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}

}
