package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session session=factory.openSession();
	        
	        //get-student:1
	        Student stu=session.get(Student.class, 1);
	        System.out.println(stu);
	        
	        session.close();

	}

}
