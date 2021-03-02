package com.example.DAO;

import com.example.Model.ClassesEntity;
import com.example.Utils.getSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ClassesDAOImpl implements ClassesDAO {
    @Override
    public Boolean set(ClassesEntity classes) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.save(classes);
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
    public ClassesEntity getById(Long class_id) {
        ClassesEntity classesEntity = new ClassesEntity();
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get the object from db with help of hibernate
            classesEntity = session.find(ClassesEntity.class, class_id);
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
    public List<ClassesEntity> getAll() {
        List<ClassesEntity> data = null;
        try {

            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get all object from db with help of hibernate
            String hql = "from ClassesEntity";

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
    public Boolean update(ClassesEntity classesEntity) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.update(classesEntity);
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
    public Boolean delete(Long id) {
        Boolean result = false;
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //remove object from db with help of hibernate
            session.delete(session.get(ClassesEntity.class, id));
            transaction.commit();
            //close session
            session.close();
            result = true;

        } catch (HibernateException e) {
            //throw an exception in exist
            e.printStackTrace();

        }
        return result;
    }
}
