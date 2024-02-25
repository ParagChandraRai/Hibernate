package com.tut;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

import org.hibernate.cfg.*;

public class EmDemo {
   public static void main(String args[])
   {
	   Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       
       Student stu=new Student();
       stu.setId(12);
       stu.setName("Vinay");
       stu.setCity("Chennai");
       
       Certificate c=new Certificate();
       c.setCourse("Android");
       c.setDuration("2 Months");
       stu.setCer(c);
       
       Session s=factory.openSession();
       Transaction tx=s.beginTransaction();
       
       s.save(stu);
       
       tx.commit();
       s.close();
       factory.close();

       
       
   }
}
