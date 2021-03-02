package com.example.DAO;

import com.example.Model.UsersEntity;
import com.example.Utils.getSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsersDAOImpl implements UsersDAO {

    @Override
    public Session set(UsersEntity usersEntity) {
        Session session = null;
        try {
            //open new session
            session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.save(usersEntity);
            //save in the DB
            transaction.commit();
            //close session
            session.close();

        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();
        }
        return session;
    }

    @Override
    public UsersEntity getById(Long user_id) {
        UsersEntity classesEntity = new UsersEntity();
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get the object from db with help of hibernate
            classesEntity = session.find(UsersEntity.class, user_id);

            transaction.commit();
            //close session
            session.close();

        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();

        }
        return classesEntity;
    }

    @Override
    public List<UsersEntity> getAll() {
        List<UsersEntity> data = null;
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();

            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get all object from db with help of hibernate
            String hql = "from UsersEntity";
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
    public Boolean update(UsersEntity usersEntity) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.update(usersEntity);
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
    public Session delete(Long id) {
        Session session = null;

        try {
            session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //remove object from db with help of hibernate
            session.delete(session.get(UsersEntity.class, id));
            transaction.commit();
            //close session
            session.close();
        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();
        }
        return session;
    }
}
