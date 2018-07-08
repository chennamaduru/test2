package com.citi.admin;
import com.citi.store.AccountDB;
import com.citi.store.CustomerDB;
public class Manager
{
	public static CustomerDB cusDb=new CustomerDB();
	public static AccountDB accDb=new AccountDB();
	
	public void createCustomer(String name,int id,long phoneNo,String emailId)
	{
		cusDb.addCustomer(name,phoneNo,emailId);
     		
	}
	public void createAccount(double initaAmt,int id,char accType )
	{
		accDb.addAccount(initAmt, id, accType);
	}

}
