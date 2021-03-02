package com.example.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "students", schema = "public")
@PrimaryKeyJoinColumn(name = "user_id")
public class StudentsEntity extends UsersEntity implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String promo;



    @ManyToOne
    @JoinColumn(name = "classe_id", referencedColumnName = "id")
    private  ClassesEntity classesEntity;


    public StudentsEntity() {
    }

    public StudentsEntity(String promo, ClassesEntity classesEntity) {
        this.promo = promo;
        this.classesEntity = classesEntity;
    }

    public StudentsEntity(String username, String password, String email, String type, String promo, ClassesEntity classesEntity) {
        super(username, password, email, type);
        this.promo = promo;
        this.classesEntity = classesEntity;
    }

    public ClassesEntity getClassesEntity() {
        return classesEntity;
    }

    public void setClassesEntity(ClassesEntity classesEntity) {
        this.classesEntity = classesEntity;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        StudentsEntity that = (StudentsEntity) o;
//
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (promo != null ? !promo.equals(that.promo) : that.promo != null) return false;
//        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
//        if (classeId != null ? !classeId.equals(that.classeId) : that.classeId != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (promo != null ? promo.hashCode() : 0);
//        result = 31 * result + (userId != null ? userId.hashCode() : 0);
//        result = 31 * result + (classeId != null ? classeId.hashCode() : 0);
//        return result;
//    }
}
