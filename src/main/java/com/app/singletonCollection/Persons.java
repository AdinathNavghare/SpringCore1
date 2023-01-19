package com.app.singletonCollection;

import java.util.List;

public class Persons {
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Persons [friends=" + friends + "]";
	}

}
