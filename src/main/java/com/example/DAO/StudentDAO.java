package com.example.DAO;

import com.example.Model.StudentsEntity;

import java.util.List;

public interface StudentDAO {

    Boolean set(StudentsEntity studentsEntity);

    StudentsEntity getById(Long std_id);

    List<StudentsEntity> getAll();

    Boolean update(StudentsEntity studentsEntity);

    Boolean delete(Long id);
}
