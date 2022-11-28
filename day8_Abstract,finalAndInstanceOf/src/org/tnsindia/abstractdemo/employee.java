package org.tnsindia.abstractdemo;

public class employee extends person {
	private int ID;

	public employee(String name, String gender, int iD) {
		super(name, gender);
		ID = iD;
	}

	@Override
	public void work() {
     if(ID>0)
     {
    	 System.out.println("Employee exist");
     }
     else
     {
    	 System.out.println("Employee not exist");
     }
	}
	
	

}
