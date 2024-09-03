package com.example.CRUD.Controller;

import com.example.CRUD.Model.Student;
import com.example.CRUD.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.example.CRUD.Model.School;

@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @GetMapping()
    public List<School> printAll(){
        return schoolService.getAll();
    }

    @PostMapping()
    public School insert(@RequestBody School school){
        return schoolService.register(school);
    }

    @PutMapping("/update/{id}")
    public School modify(@PathVariable Integer id,@RequestBody School school){
        return schoolService.update(id, school);
    }

    @DeleteMapping("/deleteAll")
    public String removeAll(){
        schoolService.eraseAll();
        return "Every value are removed";
    }
}
