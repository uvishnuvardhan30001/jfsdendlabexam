package com.klef.jfsd.exam;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;



public class ClientDemo {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();

        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Query q = s.createQuery("UPDATE Department SET name = ?1, location = ?2 WHERE id = ?3");
        
        q.setParameter(1,"cseh");
        q.setParameter(2,"vijayawada");
        q.setParameter(3, 1);
        q.executeUpdate();
        s.close();
        sf.close();
        
        
    }
}
