package com.trantanphong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.trantanphong.entity.DetailStatus;
import com.trantanphong.entity.DetailStatusKey;

public interface DetailStatusRepository extends JpaRepository<DetailStatus, DetailStatusKey>{
	@Query("select detail_status from DetailStatus detail_status where research_id = ?1")
	List<DetailStatus> findAllByResearchID(Long id);
	@Query(value = "call getStatusByResearchID(:research_id)", nativeQuery = true)
	DetailStatus getStatusNow(@Param("research_id") Long research_id); 
}
