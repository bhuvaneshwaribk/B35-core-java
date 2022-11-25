package org.tnsindia;
//child class of BMW
public class Tyre extends BMW {
	private String name2;
	 public void display2()
	 {
		 System.out.println("vehicle name is :"+name2);
	 }
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	 
}
