package com.tut;

import java.util.Date;

//import java.lang.module.Configuration;

import org.hibernate.*;

import org.hibernate.cfg.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! dfd");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
//        Student st=new Student();
//        
//        st.setId(2);
//        st.setName("Shivam");
//        st.setCity("Kolkata");
//        
        
          Address ad=new Address();
          ad.setStreet("street2");
          ad.setCity("jaipur");
          ad.setOpen(false);
          ad.setAddedDate(new Date());
          ad.setX(123.45);
          
          
          
        Session session=factory.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(ad);
        tx.commit();
        
        session.close();
        System.out.println("Done.....");
    }
}
