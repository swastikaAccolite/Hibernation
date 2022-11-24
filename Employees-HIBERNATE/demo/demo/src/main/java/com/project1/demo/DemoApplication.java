package com.project1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class DemoApplication {
	private static SessionFactory sf;

	public static void main(String[] args)
	{
		EMPLOYEE e= new EMPLOYEE();
		e.setId(2);
		e.setName("Avinash");
		e.setAddress("Kolkata, West Bengal 700075");
		e.setSalary(20000);
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(EMPLOYEE.class);

		sf = configuration.buildSessionFactory();
		Session session= sf.openSession();
		session.beginTransaction();

		session.save(e);
		session.getTransaction().commit();
		System.out.println("Data saved");






	}

}
