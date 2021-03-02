package com.example.DAO;

import com.example.Model.EventsEntity;
import com.example.Utils.getSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EventsDAOImlp implements EventsDAO {
    @Override
    public Boolean set(EventsEntity eventsEntity) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.save(eventsEntity);
            //save in the DB
            transaction.commit();
            //close session
            session.close();
            return true;

        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public EventsEntity getById(Long std_id) {
        EventsEntity studentsEntity = new EventsEntity();
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get the object from db with help of hibernate
            studentsEntity = session.find(EventsEntity.class, std_id);
            transaction.commit();
            //close session
            session.close();
        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();
        }
        return studentsEntity;
    }

    @Override
    public List<EventsEntity> getAll() {
        List<EventsEntity> data = null;
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get all object from db with help of hibernate
            String hql = "from EventsEntity";
            data = session.createQuery(hql).list();
            transaction.commit();
            //close session
            session.close();
        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();
        }
        return data;
    }

    @Override
    public Boolean update(EventsEntity eventsEntity) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.update(eventsEntity);
            //save in the DB
            transaction.commit();
            //close session
            session.close();
            return true;
        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean delete(Long user_id) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //remove object from db with help of hibernate
            session.delete(session.get(EventsEntity.class, user_id));

            transaction.commit();
            //close session
            session.close();

            return true;
        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();
        }
        return false;
    }

}
