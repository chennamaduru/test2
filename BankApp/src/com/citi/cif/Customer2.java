package com.citi.cif;

public class Customer2
{
	private String name;
	final private int id;
	private String emailId;
    private long phoneNo;
	private String address;
	public Customer2(String name, int id, String emailId, long phoneNo, String address) 
	{
		this.name = name;
		this.id = id;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	
	
	

}
