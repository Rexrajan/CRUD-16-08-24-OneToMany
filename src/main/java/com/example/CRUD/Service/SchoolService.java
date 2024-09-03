package com.example.CRUD.Service;

import com.example.CRUD.Model.Student;
import com.example.CRUD.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CRUD.Model.School;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;



    public List<School> getAll() {
        return schoolRepository.findAll();
    }

    public School register(School school){
        return schoolRepository.save(school);
    }

    public School update(Integer id,School school){
        Optional<School> toUpdate = schoolRepository.findById(id);
        if (toUpdate.isPresent()){
            School schoolUpdate = toUpdate.get();
            schoolUpdate.setSchoolName(school.getSchoolName());
            schoolUpdate.setStudent(school.getStudent());
            return schoolRepository.save(schoolUpdate);
        }
        throw new RuntimeException("School ID is not found");
    }

    public void eraseAll(){
        schoolRepository.deleteAll();
    }

}
