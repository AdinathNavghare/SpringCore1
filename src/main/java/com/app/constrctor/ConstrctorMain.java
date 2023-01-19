package com.app.constrctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstrctorMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/app/constrctor/CIcfq.xml");
		Person p=(Person)context.getBean("per");
		System.out.println(p);
	}
}
