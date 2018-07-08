package com.pack;

public class Sim 
{
	private int simId;
	private String provide;
	public Sim(int simId, String provide)
	{
		this.simId=simId;
		this.provide=provide;
	}
	public String toString()
	  {
		return "SimId:"+simId+"Provider:"+provide;
	  }
}


