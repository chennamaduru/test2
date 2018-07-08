package com.citi.store;
import com.citi.accounts.Account;
import com.citi.cif.Customer;
public class AccountDB
{
	private Account[] accDB=new Account[10];
	private static int randNum=7777262;
	private static int count;
	public void addAccount(double initAmt,int id,char accType)
	{
		if(count<accDB.length)
		{
			if(accType=='s')
			{
				accDB[count++]=new SavingsAccount(randNum++,initAmt,id);
				System.out.println("account number is"+accDB[count-1].getAccNo());
			}
			else if
			{
				accDB[count++]=new loanAccount(randNum++,initAmt,id);
				System.out.println("account number is"+accDB[count-1].getAccNo());
			}
		}
		
	}
	public Account getAccount(int accNo)
	{
		Account acc=null;
		for(int i=0;i<accDB.length;i++)
		{
			if(accDB[i].getAccno==accNO)
			{
			System.out.println();
			acc=accDB[i];
			}
			else
			{
				System.out.println("account not found");
			}
		}
		return acc;
	}

}
