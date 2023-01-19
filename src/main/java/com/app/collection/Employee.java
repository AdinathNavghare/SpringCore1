package com.app.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> Address;
	private Map<String, String> coures;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddress() {
		return Address;
	}

	public void setAddress(Set<String> address) {
		Address = address;
	}

	public Map<String, String> getCoures() {
		return coures;
	}

	public void setCoures(Map<String, String> coures) {
		this.coures = coures;
	}

	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> coures) {
		super();
		this.name = name;
		this.phones = phones;
		Address = address;
		this.coures = coures;
	}

	public Employee() {
		super();
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", Address=" + Address + ", coures=" + coures + "]";
	}

}
