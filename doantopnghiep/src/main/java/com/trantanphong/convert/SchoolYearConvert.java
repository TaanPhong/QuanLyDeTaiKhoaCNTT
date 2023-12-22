package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.SchoolYearDTO;
import com.trantanphong.entity.SchoolYear;

@Component
public class SchoolYearConvert {

	public SchoolYear toEntity(SchoolYearDTO dto) {
		SchoolYear entity = new SchoolYear();
		try {
			entity.setAcademicYear(dto.getAcademicYear());
			entity.setSchoolYearName(dto.getSchoolYearName());
			if(dto.getDateStart() != null)
			{
				entity.setDateBegin(dto.getDateStart());
			}
			if(dto.getDateEnd() != null) {
				entity.setDateEnd(dto.getDateEnd());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public SchoolYear toEntity(SchoolYear entity, SchoolYearDTO dto) {
		try {
			entity.setId(dto.getId());
			entity.setAcademicYear(dto.getAcademicYear());
			entity.setSchoolYearName(dto.getSchoolYearName());
			if(dto.getDateStart() != null)
			{
				entity.setDateBegin(dto.getDateStart());
			}
			if(dto.getDateEnd() != null) {
				entity.setDateEnd(dto.getDateEnd());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public SchoolYearDTO toDTO(SchoolYear entity) {
		SchoolYearDTO dto = new SchoolYearDTO();
		try {
			dto.setId(entity.getId());
			dto.setAcademicYear(entity.getAcademicYear());
			dto.setSchoolYearName(entity.getSchoolYearName());
			if(entity.getListResearchs() != null)
			{
				dto.setLengthResearch(entity.getListResearchs().size());
			}
			if(entity.getDateBegin() != null)
			{
				dto.setDateStart(entity.getDateBegin());
			}
			if(entity.getDateEnd() != null) {
				dto.setDateEnd(entity.getDateEnd());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
