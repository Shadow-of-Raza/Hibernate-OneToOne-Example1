package com.mavan.HiberbateApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp 
{
	public static void main(String[] args) 
	{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student1.class);
		config.addAnnotatedClass(Courses.class);
		
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		///Object 1
		
		Courses c1 = new Courses();
		c1.setCoursename("Java full stack");
		c1.setCoursefee(40000.00f);
		session.save(c1);
		
		Student1 s1 = new Student1();
		s1.setStudentname("Ansar");
		s1.setCourse(c1);
		session.save(s1);

		///Object 2

		Courses c2 = new Courses();
		c2.setCoursename("python full stack");
		c2.setCoursefee(40000.00f);
		session.save(c2);

		Student1 s2 = new Student1();
		s2.setStudentname("Lavanya");
		s2.setCourse(c2);
		session.save(s2);
	
		transaction.commit();
		session.close();
	}
}
