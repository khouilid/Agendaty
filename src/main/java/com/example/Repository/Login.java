package com.example.Repository;

import com.example.Model.UsersEntity;
import com.example.Utils.getSessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class Login {

    public static UsersEntity loginUser(String email, String pwd) {

        UsersEntity usersEntity = null;
        Session session = getSessionFactory.hibernateUtil().openSession();
        Query query = session.createNamedQuery("findUser", UsersEntity.class);
        query.setParameter("mail", email);
        query.setParameter("pwd", pwd);

        try {
            usersEntity = (UsersEntity) query.getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return usersEntity;
    }


}
