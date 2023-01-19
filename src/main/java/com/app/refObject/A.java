package com.app.refObject;

public class A {
	private int no;
	private B ob;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A(int no, B ob) {
		super();
		this.no = no;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [no=" + no + "]";
	}

}
