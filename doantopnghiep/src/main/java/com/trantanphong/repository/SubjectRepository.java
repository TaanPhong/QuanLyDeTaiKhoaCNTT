package com.trantanphong.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trantanphong.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, String> {
	Optional<Subject> findByNameSubject(String nameSubject);

	@Query(value = "call statisticalSubjectResearch(:schoolYear_id)", nativeQuery = true)
	List<Tuple> statisticalSubjectResearch(@Param("schoolYear_id") long id);

	@Query(value = "call statisticalTotal()", nativeQuery = true)
	List<Tuple> statisticalTotals();
}
