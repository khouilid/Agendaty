package com.example.DAO;

import com.example.Model.UsersEntity;
import org.hibernate.Session;

import java.util.List;

public interface UsersDAO {

    Session set(UsersEntity classes);

    UsersEntity getById(Long class_id);

    List<UsersEntity> getAll();

    Boolean update(UsersEntity classesEntity);

    Session delete(Long id);
}
