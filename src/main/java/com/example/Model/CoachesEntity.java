package com.example.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "coaches", schema = "public")
@PrimaryKeyJoinColumn(name = "user_id")
public class CoachesEntity  extends UsersEntity implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "classe_id", referencedColumnName = "id")
    private  ClassesEntity classesEntity;


    public CoachesEntity() {
    }

    public CoachesEntity(String username, String password, String email, String type, ClassesEntity classesEntity) {
        super(username, password, email, type);
        this.classesEntity = classesEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name = "classe_id")
    public ClassesEntity getClasseId() {
        return classesEntity;
    }

    public void setClasseId(ClassesEntity classeId) {
        this.classesEntity = classeId;
    }



}
