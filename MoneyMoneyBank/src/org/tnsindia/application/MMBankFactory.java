package org.tnsindia.application;

import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int AcctNo, String acctNm, float accBal, boolean isSalaried) {
		MMSavingAcc a=new MMSavingAcc(AccNo,acctNm,accBal,isSalaried);
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String acctNm, float accBal, float creditLimit) {
		MMCurrentAcc a=new MMCurrentAcc(AccNo,accNm,accBal,creditLimit);
		return null;
	}
	

}
