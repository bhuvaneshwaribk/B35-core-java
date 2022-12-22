package org.tnsindia.entities;

public class Employee {
	private int ID;
	private String Name;
	
	
	public Employee(int iD, String name) {
		super();
		ID = iD;
		Name = name;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + "]";
	}
	

}
