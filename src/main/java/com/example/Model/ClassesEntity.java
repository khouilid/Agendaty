package com.example.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "classes", schema = "public")
public class ClassesEntity implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Basic
    @Column(name = "classesname")
    private String classesname;


    public ClassesEntity() {
    }


    public ClassesEntity(String classesname) {
        this.classesname = classesname;
    }

//    @OneToMany
//    private List<StudentsEntity> listOfStudants ;
//
//
//    @OneToMany
//    private List<CoachesEntity> listOfCoaches ;





//    public List<CoachesEntity> getListOfCoaches() {
//        return listOfCoaches;
//    }
//
//    public void setListOfCoaches(List<CoachesEntity> listOfCoaches) {
//        this.listOfCoaches = listOfCoaches;
//    }
//
//
//    public List<StudentsEntity> getListOfStudants() {
//        return listOfStudants;
//    }
//
//    public void setListOfStudants(List<StudentsEntity> listOfStudants) {
//        this.listOfStudants = listOfStudants;
//    }
//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getClassesname() {
        return classesname;
    }

    public void setClassesname(String classesname) {
        this.classesname = classesname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassesEntity that = (ClassesEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (classesname != null ? !classesname.equals(that.classesname) : that.classesname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (classesname != null ? classesname.hashCode() : 0);
        return result;
    }
}
