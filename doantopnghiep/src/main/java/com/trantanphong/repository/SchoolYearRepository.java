package com.trantanphong.repository;

import java.util.List;

import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.trantanphong.entity.SchoolYear;

public interface SchoolYearRepository extends JpaRepository<SchoolYear, Long>{
	SchoolYear findBySchoolYearName(String schoolYearName);
	@Query(value = "call getMaxSchoolYear()", nativeQuery = true)
	List<SchoolYear> getMaxSchoolYear();
	
	@Query(value = "call statisticalResearchYear()", nativeQuery = true)
	List<Tuple> statisticalResearchYear();
}
