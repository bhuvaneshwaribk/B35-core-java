package org.tnsindia.framework;

public abstract class SavingAcc extends BankAcc {
	
	//data members
			private boolean isSalaried;
			static final private float MINBAL=1000.0f;
			
	//constructor
	public SavingAcc(int accNo, float accBal, String accNm,boolean isSalaried) {
		super(accNo, accBal, accNm);
		this.isSalaried=isSalaried;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Account no.is: "+this.getAccNo()+" "+
				"Account name is: "+this.getAccNm()+" "+
				"Balance is: "+(accBal+MINBAL));
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
		
		

}
