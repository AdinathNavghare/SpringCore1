package com.app.Awired;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {

	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
