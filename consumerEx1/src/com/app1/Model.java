package com.app1;

import java.util.Map;

public class Model 
{
	private int modId;
	String modCode;
	double modCost;
	Map<Integer,Margin> mg;

	public int getModId() {
		return modId;
	}
	public void setModId(int modId) {
		this.modId = modId;
	}
	public String getModCode() {
		return modCode;
	}
	public void setModCode(String modCode) {
		this.modCode = modCode;
	}
	public double getModCost() {
		return modCost;
	}
	public void setModCost(double modCost) {
		this.modCost = modCost;
	}
	public Map<Integer, Margin> getMg() {
		return mg;
	}
	public void setMg(Map<Integer, Margin> mg) {
		this.mg = mg;
	}
	
}
