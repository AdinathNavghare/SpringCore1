package com.app.Awired.Anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/Awired/Anno/configData.xml");
		Emp emp=ctx.getBean("Data",Emp.class);
		System.out.println(emp);
	}
}
