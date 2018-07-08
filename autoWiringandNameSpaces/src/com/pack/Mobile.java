package com.pack;

public class Mobile
{
  private int id;
  private String model;
  private Sim sim;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Sim getSim() {
	return sim;
}
public void setSim(Sim sim) {
	this.sim = sim;
}
public String toString()
  {
	return "Mobile Id:"+id+"Model"+model+"Sim:"+sim;
  }
}
