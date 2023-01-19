package com.app.refObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello   Adi....");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/app/refObject/refcfq.xml");
		A a=(A)context.getBean("aref");
		System.out.println(a.getOb().getY());
		System.out.println(a.getNo());
		System.out.println(a);
	}

}
