package org.tnsindia.application;

import org.tnsindia.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, float accBal, String accNm, float creditLimit) {
		super(accNo, accBal, accNm, creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + "]";
	}

}
