package org.tnsindia.application;

import org.tnsindia.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, float accBal, String accNm, boolean isSalaried) {
		super(accNo, accBal, accNm, isSalaried);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}
	
	
	

}
