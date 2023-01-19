package com.app.expl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.SpelParseException;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/app/expl/config.xml");
		DemoText dt=con.getBean("demo1",DemoText.class);
		System.out.println(dt);
		System.out.println("///////////////////////////////////");
		 SpelExpressionParser expl=new SpelExpressionParser();
		 Expression exp=expl.parseExpression("22+44");
		 System.out.println(exp.getValue());
	}
}
