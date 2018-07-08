package com.citi.store;
import com.citi.cif.Customer;
public class CustomerDB
{
	Customer[] cusDB=new Customer(10);
	private static randNum=378621;
	 private static int count;
	 void addCustomer(String name,long phoneNo,String emailId)
	 { 
		 if (count<cusDB.length)
		 {
			 cusDB[count++]=new Coustomer(random++,name,phoneNo,emailId);
			 System.out.println("customer Id is"+cusDB[count-1].getId());
		 }
		 else
		 {
			 System.out.println("cannot add customer");
		 }
		 
	 }
	 Customer getCustomer(int id)
	 {
		 Customer cust=null;
		 for(int i=0;i<cusDB.length;i++)
		 {
			 if(cusDB[i].getId()=id)
			 {
				 System.out.println("couster found");
				 cust=custDB[i];
			 }
		 }
		 
	 }

}