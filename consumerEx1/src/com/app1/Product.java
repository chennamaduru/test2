package com.app1;

import java.util.List;

public class Product
{
  private int proId;
  String proName;
  List<Model> mod;
public int getProId() {
	return proId;
}
public void setProId(int proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public List<Model> getMod() {
	return mod;
}
public void setMod(List<Model> mod) {
	this.mod = mod;
}
}
