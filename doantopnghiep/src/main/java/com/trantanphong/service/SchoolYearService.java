package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.SchoolYearDTO;
import com.trantanphong.dto.SchoolYearResearch;
import com.trantanphong.entity.SchoolYear;

public interface SchoolYearService {
	List<SchoolYearDTO> getAll();

	SchoolYearDTO save(SchoolYearDTO dto);

	void delete(long id);

	SchoolYear getMaxSchoolYear();

	List<SchoolYearResearch> getStatisticalResearchYear();

	SchoolYearDTO getSchoolYearMax();
	
	SchoolYearDTO getSchoolYearByID(long id);

}
