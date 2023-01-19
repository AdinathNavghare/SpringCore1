package com.app.model;

public class Student {
	private int studentNo;
	private String studentName;
	private String studentAddress;
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		System.out.println("no");
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		System.out.println("address");
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public Student(int studentNo, String studentName, String studentAddress) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
