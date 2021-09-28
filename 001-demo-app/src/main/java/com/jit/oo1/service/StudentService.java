package com.jit.oo1.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jit.oo1.model.Student;


public interface StudentService {
	Student save(Student student);
	Student fatchStudentById(Long id);
}
