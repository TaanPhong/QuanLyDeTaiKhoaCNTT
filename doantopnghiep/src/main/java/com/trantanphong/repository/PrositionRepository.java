package com.trantanphong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trantanphong.entity.Prosition;

public interface PrositionRepository extends JpaRepository<Prosition, Long>{
	Prosition findByNameProsition(String nameProsition);
}
