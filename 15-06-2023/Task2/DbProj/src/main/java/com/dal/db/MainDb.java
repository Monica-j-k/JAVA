package com.dal.db;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDb {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("dbc.xml");

		DbConn db = (DbConn) context.getBean("db");
		System.out.println(db.getUrl() + " " + db.getUname() + " " + db.getPassword());
		DbConn.getMyConnection();
	}
}
