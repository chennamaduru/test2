package com.citi.accounts;

public interface Account
{

	 void deposit(double amt);
	 void withdrawl(double amt);
	 void checkBalance();
	 void fundTransfer(double a1,double amt);
	 int getAccNo();
	 double getAccbal;
}
