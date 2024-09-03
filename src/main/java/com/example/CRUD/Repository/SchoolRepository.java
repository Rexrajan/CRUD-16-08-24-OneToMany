package com.example.CRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.CRUD.Model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer>{

}
