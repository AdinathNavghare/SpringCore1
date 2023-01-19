package com.app.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaMain {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/app/lifeCycle/cyclecfg.xml");
		/*
		 * Samosa s1=(Samosa)context.getBean("s1"); System.out.println(s1);
		 * context.registerShutdownHook(); System.out.println("==============="); Pepsi
		 * p=(Pepsi)context.getBean("p1"); System.out.println(p);
		 */
		System.out.println("////////////////////////");
		Pav p11=(Pav) context.getBean("pa");
		System.out.println(p11);
		
	}
}
