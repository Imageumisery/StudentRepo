package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository 
extends JpaRepository<Student, Long> {

	@Query("SELECT s FROM Student s WHERE s.email = ?1")default
//	studentRepository.findStudentByEmail(student.getEmail());
	Optional<Student> findStudentByEmail() {
		return findStudentByEmail();
	}

	@Query("SELECT s FROM Student s WHERE s.email = ?1")
//	studentRepository.findStudentByEmail(student.getEmail());
	Optional<Student> findStudentByEmail(String email);


	

}
