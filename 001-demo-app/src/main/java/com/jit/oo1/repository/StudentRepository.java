package com.jit.oo1.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.oo1.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
