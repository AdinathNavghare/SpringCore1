package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Student;

public class SpringApp {

	public static void main(String[] args) {
		System.out.println("Hello Adi...");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/confiq/confiq1.xml");
		Student student1=(Student)context.getBean("student1");
		System.out.println(student1);
		Student student2=(Student)context.getBean("student2");
		System.out.println(student2);
	}
}
