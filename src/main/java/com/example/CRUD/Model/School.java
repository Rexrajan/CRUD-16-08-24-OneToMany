package com.example.CRUD.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String schoolName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "schoolId")
    private List<Student> student;

    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String inputValue){
        schoolName = inputValue;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
