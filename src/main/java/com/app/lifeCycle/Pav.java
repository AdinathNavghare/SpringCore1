package com.app.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pav {
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Pav() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pav [sub=" + sub + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("start method");
	}
	@PreDestroy
	public void set()
	{
		System.out.println("set method");
	}
}
