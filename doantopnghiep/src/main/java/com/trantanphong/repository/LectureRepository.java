package com.trantanphong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trantanphong.entity.Lectures;

public interface LectureRepository extends JpaRepository<Lectures, Long>{
	Lectures findByEmail(String email);
	@Query("select lectures from Lectures lectures where subject_id = ?1")
	List<Lectures> getAllLecturesBySubjectCode(String subjectCode);
}
