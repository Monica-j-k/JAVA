package com.dal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Wel.xml");
		Welcome guest = (Welcome)context.getBean("guest");
		System.out.println(guest.greeting());
	}

}
