package com.trantanphong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trantanphong.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{
	@Query("select student from Student student where class_id = ?1")
	List<Student> findByClassName(String className);
	
	@Query(value = "call getAllStudentBySubject(:subject_id)", nativeQuery = true)
	List<Student> getAllStudentBySubject(@Param("subject_id") String subject_id);
	
	@Query(value = "call getStudentNotReseachBySubject(:subject_id)", nativeQuery = true)
	List<Student> getAllStudentNotResearchBySubject(@Param("subject_id") String subjectId);
	
	@Query(value = "call getStudentNotReseach()", nativeQuery = true)
	List<Student> getAllStudentNotResearch();
}
