package com.gozdesy.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gozdesy.entity.Address;
import com.gozdesy.entity.Course;
import com.gozdesy.entity.Grade;
import com.gozdesy.entity.Student;


public class HibernateSession {
	
private static SessionFactory sessionFactory = sessionFactory();
	
	private static SessionFactory sessionFactory() { 
		
		SessionFactory factory = null;
		
		try {
			Configuration config = new Configuration();	
			
			config.addAnnotatedClass(Student.class);
			config.addAnnotatedClass(Address.class);
			config.addAnnotatedClass(Course.class);
			config.addAnnotatedClass(Grade.class);
			factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
			
		} catch (Exception ex) {
			System.err.println("Someting went terribly wrong: " + ex.getMessage());
		}
		return factory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
