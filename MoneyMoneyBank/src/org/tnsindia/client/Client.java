package org.tnsindia.client;

import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory f=new org.tnsindia.application.MMBankFactory();
		SavingAcc s=new org.tnsindia.application.MMSavingAcc(100,20000,"SavingAccount",true);
		CurrentAcc n=new org.tnsindia.application.MMCurrentAcc(101,20000,"current Account",10000);
		System.out.println("Saving Account Details: ");
		s.withdraw(s.getAccBal());
		
		System.out.println();
		
		System.out.println("Current Account Details: ");
		
		s.withdraw(s.getAccBal());
		
		System.out.println();
		
		System.out.println(s);
		System.out.println(n);








	}

}
