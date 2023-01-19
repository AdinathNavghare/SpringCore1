package com.app.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpText {

	public static void main(String[] args) {
		System.out.println("Hello Adi....");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/collection/cfq.xml");
		Employee emp1=(Employee) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCoures());
	}

}
