package com.example.CRUD.Model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Student Name")
    private String name;
    @Column(name = "Student Age")
    private Integer age;


    @Column(name = "Tamil")
    private Integer tamil;
    @Column(name = "English")
    private Integer english;
    @Column(name = "Maths")
    private Integer maths;
    @Column(name = "Science")
    private Integer science;
    @Column(name = "Social")
    private Integer social;
    /*@Column(name = "Total Marks")
    private Integer totalMarks;
    @Column(name = "Percentage")
    private Double percentage;*/

    public String getName(){
        return name;
    }
    public void setName(String inputValue){
        name = inputValue;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer inputValue){
        age = inputValue;
    }

    public Integer getTamil(){
        return tamil;
    }
    public void setTamil(Integer inputValue){
        tamil = inputValue;
    }

    public Integer getEnglish(){
        return english;
    }
    public void setEnglish(Integer inputValue){
        english = inputValue;
    }
    public Integer getMaths(){
        return maths;
    }
    public void setMaths(Integer inputValue){
        maths = inputValue;
    }
    public Integer getScience(){
        return science;
    }
    public void setScience(Integer inputValue){
        science = inputValue;
    }

    public Integer getSocial(){
        return social;
    }
    public void setSocial(Integer inputValue){
        social = inputValue;
    }


   /* public Integer getTotalMarks(){
        return totalMarks;
    }
    public void setTotalMarks(Integer inputValue){
        totalMarks = inputValue;
    }
    public Double getPercentage(){
        return percentage;
    }
    public void setPercentage(Double inputValue){
        percentage = inputValue;
    }
*/

}
