package com.app.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Strudent {
	public Strudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Value("Adi")
	private String name;
	@Value("Pune")
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Strudent [name=" + name + ", city=" + city + "]";
	}
	public Strudent(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
}
