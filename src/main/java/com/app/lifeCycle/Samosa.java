package com.app.lifeCycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public Samosa()
	{
		
	}
	public void init() {
		System.out.println("inside init method");
	}
	public void destroy()
	{
		System.out.println("destroy method");
	}
	public void hey() {
		System.out.println("inside hey method");
	}
	public void bye()
	{
		System.out.println("bye method");
	}

}
