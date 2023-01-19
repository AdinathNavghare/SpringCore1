package com.app.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/app/sterotype/stereo.xml");
		Strudent std=con.getBean("student",Strudent.class);
		Strudent std1=con.getBean("student",Strudent.class);
		System.out.println(std.hashCode());
		System.out.println(std1.hashCode());
	}
}
