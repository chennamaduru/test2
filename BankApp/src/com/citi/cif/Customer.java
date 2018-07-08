package com.citi.cif;

public class Customer
{


  Customer(String name,int id,String emailId,long phoneNo,String address)
  {
	  this.name=name;
	  this.id=id;
	  this.emailId=emailId;
	  this.phoneNo=phoneNo;
	  this.address=address;
	  
  }
	public String getName()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	public String getEmailId()
	{
		return emailId;
	}
	public long getPhoneNo()
	{
		return phoneNo;
	}
	public String getAddress()
	{
		return address;
	}
	public void setEmailId(String emailId)
	{
		this.emailId=emailId;
	} 
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}

}
