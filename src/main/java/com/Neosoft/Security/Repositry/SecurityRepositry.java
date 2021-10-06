package com.Neosoft.Security.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Neosoft.Security.Entity.Student;

@Repository
public interface SecurityRepositry extends JpaRepository<Student, Integer> {

	
}
