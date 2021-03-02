package com.example.DAO;

import com.example.Model.EventsEntity;
import com.example.Model.StudentsEntity;

import java.util.List;

public interface EventsDAO {
    Boolean set(EventsEntity studentsEntity);

    EventsEntity getById(Long std_id);

    List<EventsEntity> getAll();

    Boolean update(EventsEntity studentsEntity);

    Boolean delete(Long id);
}
