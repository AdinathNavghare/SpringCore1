package com.app.constrctor;

public class Person {
	private int personId;
	private String name;
	private Cust cust;
	
	
	public Person()
	{
		
	}
	public Person(int personid,String name,Cust cust)
	{
		this.personId=personid;
		this.name=name;
		
	}
	public String  toString()
	{
		return this.personId +":"+this.name+":"+this.cust;
	}
}
