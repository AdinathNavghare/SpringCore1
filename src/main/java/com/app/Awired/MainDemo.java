package com.app.Awired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/app/Awired/configData.xml");
		Emp emp=ctx.getBean("emp1",Emp.class);
		System.out.println(emp);
	}
}
