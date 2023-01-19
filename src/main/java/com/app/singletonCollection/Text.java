package com.app.singletonCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/app/singletonCollection/aloncfq.xml");
		Persons per=con.getBean("person1",Persons.class);
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
	}

}
