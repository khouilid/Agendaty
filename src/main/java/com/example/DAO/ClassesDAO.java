package com.example.DAO;

import com.example.Model.ClassesEntity;

import java.util.List;

public interface ClassesDAO {


    Boolean set(ClassesEntity classes);

    ClassesEntity getById(Long class_id);

    List<ClassesEntity> getAll();

    Boolean update(ClassesEntity classesEntity);

    Boolean delete(Long id);
}
