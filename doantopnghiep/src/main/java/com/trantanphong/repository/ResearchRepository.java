package com.trantanphong.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trantanphong.entity.Research;

public interface ResearchRepository extends JpaRepository<Research, Long> {
	@Query(value = "call getAllResearchToAssigne(:subject_id, :school_id)", nativeQuery = true)
	List<Research> getAllResearchToAssigne(@Param("subject_id") String subject_id, @Param("school_id") long school_id);

	@Query(value = "call getAllResearchEligible(:subject_id, :school_id)", nativeQuery = true)
	List<Research> getAllResearchEnligible(@Param("subject_id") String subject_id, @Param("school_id") long school_id);

	@Query("select research from Research research where school_year_id = ?1 and lecture_id = ?2")
	List<Research> getAllResearchBySchoolYear(long schoolId, long lectureId);

	@Query("select research from Research research where school_year_id = ?1")
	List<Research> getAllResearchBySchoolYearID(long schoolID);

	@Query("select research from Research research where school_year_id = ?1 and subject_id = ?2")
	List<Research> getAllResearchBySchoolYearAndSubjectId(long schoolID, String subjectCode);

	@Query("select research from Research research where subject_id = ?1")
	List<Research> getAllResearchBySubjectCode(String subjectCode);

	@Query(value = "call checkAddReportAuto(:school_id)", nativeQuery = true)
	List<Research> getAllResearchSchoolYearNowNotReport(@Param("school_id") Long id);

	@Query(value = "call getAllResarchSchoolYearStatusFaculty(:school_id, :status_id)", nativeQuery = true)
	List<Research> getAllResearchSchoolYearStatus(@Param("school_id") long schoolId, @Param("status_id") long statusId);
	
	@Query(value = "call getAllResarchStatusFaculty(:status_id)", nativeQuery = true)
	List<Research> getAllResearchStatusFaculty(@Param("status_id") long statusId);
	
	@Query(value = "call statiscalResearchStudentBySchoolYear(:school_id)", nativeQuery = true)
	List<Tuple> getStatisticalResearchStudent(@Param("school_id") long schoolId);
	
	@Query(value = "call statiscalResearchStudent()", nativeQuery = true)
	List<Tuple> getStatisticalResearchStudentAllSchoolYear();
	
}
