package org.tnsindia.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;
	
	public CurrentAcc(int accNo, float accBal, String accNm,float creditLimit) {
		super(accNo, accBal, accNm);
		this.creditLimit=creditLimit;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Account no.is: "+this.getAccNo()+" "+
				"Account name is: "+this.getAccNm()+" "+
				"Balance is: "+(accBal+creditLimit));
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}


}
