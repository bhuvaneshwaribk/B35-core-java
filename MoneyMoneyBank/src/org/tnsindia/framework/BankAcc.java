package org.tnsindia.framework;

public abstract class BankAcc {
	//data members
	private int accNo;
	private float accBal;
	private String accNm;
	
	//constructor
	public BankAcc(int accNo, float accBal, String accNm) {
		super();
		this.accNo = accNo;
		this.accBal = accBal;
		this.accNm = accNm;
	}
	//abstract method
			abstract public void withdraw(float accBal);
			
	//non-abstract method
			public void deposite(float accBal)
			{
				System.out.println(accBal);
			}		
			
	//getter and setter method
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accBal=" + accBal + ", accNm=" + accNm + "]";
	}
		
	

}
