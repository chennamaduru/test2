package com.citi.accounts;

public class Savings implements Account
{
	private double accBalance;
	private int accNo;
//	public int getAccNo()
//	{
//		return accNo;
//	}
	public savingsAccount(int accNo,double accBalance,int id)
	{
		this.accNo=accNo;
		this.accBalance=accBalance;
		this.id=id;
	}

	public void deposit(double amt)
	{
		this.accBalance=accBalance+amt;
	}

	public void withdrawl(double amt)
	{
		this.accBalance=accBalance-amt;
		
	}
    public void checkBalance()
    {
    	this.accBalance;

	}
    public void fundTransFer(double accNo, double amt)
    {
	 a1.deposit(amt);
	 this.withdrawl(amt);
		
	}
	
	

}
