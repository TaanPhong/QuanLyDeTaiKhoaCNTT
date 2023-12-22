package com.trantanphong.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trantanphong.entity.Class;

public interface ClassRepository extends JpaRepository<Class, String> {
	Optional<Class> findByClassName(String className);

	@Query("select classes from Class classes where subject_id = ?1")
	List<Class> getAllClassBySubjectCode(String subjectId);
}
