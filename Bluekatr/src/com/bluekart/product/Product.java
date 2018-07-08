package com.bluekart.product;

public class Product implements comparable
{
 int id;
 double price;
 String brand;
 String name;
public Product(int id, double price, String brand, String name)
{
	
	this.id = id;
	this.price = price;
	this.brand = brand;
	this.name = name;
}

public String toString()
{
	return "Product [id=" + id + ", price=" + price + ", brand=" + brand + ", name=" + name + "]";
}

 
 
}
