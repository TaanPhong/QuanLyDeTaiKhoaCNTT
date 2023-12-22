package com.trantanphong.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trantanphong.dto.ResearchDTO;
import com.trantanphong.dto.SubjectDTO;
import com.trantanphong.entity.Research;
import com.trantanphong.entity.Subject;

@Component
public class SubjectConvert {
	@Autowired
	private ResearchConvert researchConvert;

	public Subject toEntity(SubjectDTO dto) {
		Subject entity = new Subject();
		try {
			entity.setNameSubject(dto.getSubjectName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public Subject toEntity(Subject entity, SubjectDTO dto) {
		try {
			entity.setSubject_code(dto.getSubjectCode());
			entity.setNameSubject(dto.getSubjectName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public SubjectDTO toDTO(Subject entity) {
		SubjectDTO dto = new SubjectDTO();
		try {
			dto.setSubjectCode(entity.getSubject_code());
			dto.setSubjectName(entity.getNameSubject());
			if(!entity.getListResearchs().isEmpty())
			{
				List<ResearchDTO> researchDTOs = new ArrayList<>();
				for (Research element : entity.getListResearchs()) {
					ResearchDTO newDTO = researchConvert.toDTO(element);
					researchDTOs.add(newDTO);
				}
				dto.setResearchDTOs(researchDTOs);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
