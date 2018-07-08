package com.citi.admin;
import com.citi.accounts.Account;
import com.citi.store.AccountDB;
public class TellerTransaction
{
	public void deposit(int accNo,double amt)
	{
		Account a1=Manager.accDb.getAccount(accNo);
				if(a1!= null)
				{
					a1.deposit(amt);
				}

	}
	
   public void withdrawl(int accNo,double amt)
   {
	   Account a1=Manager.accDb.getAccount(accNo);
	   if(a1!=null && amt>a1.getAccBal())
	   {
		   a1.withdrawl(amt);
	   }
   } 
   public void balanceEnquiry(int accNo)
   {
	   Account a1=Manager.accDb.getAccount(accNo);
	   if(a1!=null)
	   {
		   a1.checkBalance();
	   }
	   
   }
   public void transferAmount(int fromAccNo,int toAccNo,double amt)
   {
	   Account fAcc=Manager.accDb.getAccount(fromAccno);
	   Account tAcc=Manager.accDb.getAccount(toAccNo);
	   if(fAcc!=null&&tAcc !=null)
	   {
		   if(fAcc.getAccBal()>amt)
		   {
			   fAcc.funndTransfer(tAcc,amt);
		   }
			   
	   }
   }
}
