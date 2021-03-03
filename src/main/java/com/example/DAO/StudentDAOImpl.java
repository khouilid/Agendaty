package com.example.DAO;

import com.example.Model.StudentsEntity;
import com.example.Utils.getSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public Boolean set(StudentsEntity studentsEntity) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.save(studentsEntity);
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
    public StudentsEntity getById(Long std_id) {
        StudentsEntity studentsEntity = new StudentsEntity();
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get the object from db with help of hibernate
            studentsEntity = session.find(StudentsEntity.class, std_id);
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
    public List<StudentsEntity> getAll() {
        List<StudentsEntity> data = null;
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //get all object from db with help of hibernate
            String hql = "from StudentsEntity";
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
    public Boolean update(StudentsEntity studentsEntity) {
        try {
            Session session = getSessionFactory.hibernateUtil().openSession();
            //start the transaction
            Transaction transaction = session.beginTransaction();
            //save object in the session
            session.update(studentsEntity);
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
            session.delete(session.get(StudentsEntity.class, user_id));

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
