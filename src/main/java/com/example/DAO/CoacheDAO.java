package com.example.DAO;

import com.example.Model.ClassesEntity;
import com.example.Model.CoachesEntity;
import org.hibernate.Session;

import java.util.List;

public interface CoacheDAO {



    Boolean set(CoachesEntity coachesEntity);

    CoachesEntity getById(Long user_id);

    List<CoachesEntity> getAll();

    Boolean update(CoachesEntity coachesEntity);

    Boolean delete(Long id);
}
