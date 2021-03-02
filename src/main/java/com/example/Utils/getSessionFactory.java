package com.example.Utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class getSessionFactory {

    public static SessionFactory hibernateUtil(){
        SessionFactory sessionFactory = null;
        try {
            sessionFactory =   new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }
}
