package com.app.Awired;

public class Address {
	private String city;
	private String name;

	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setter");
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address(String city, String name) {
		super();
		this.city = city;
		this.name = name;
		System.out.println("bye");
	}
	public Address()
	{
		System.out.println("hello");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", name=" + name + "]";
	}

}
