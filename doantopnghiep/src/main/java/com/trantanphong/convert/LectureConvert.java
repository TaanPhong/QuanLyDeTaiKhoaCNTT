package com.trantanphong.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trantanphong.dto.LectureDTO;
import com.trantanphong.dto.ResearchDTO;
import com.trantanphong.entity.Lectures;
import com.trantanphong.entity.Research;

@Component
public class LectureConvert {
	@Autowired
	private ResearchConvert researchConvert;

	public Lectures toEntity(LectureDTO dto) {
		Lectures entity = new Lectures();
		try {
			entity.setSurname(dto.getSurname());
			entity.setFirstName(dto.getFirstName());
			if (dto.getGender().equals("Nam")) {
				entity.setGender((long) 0);
			} else {
				entity.setGender((long) 1);
			}
			entity.setEmail(dto.getEmail());
			entity.setNumberPhone(dto.getNumberPhone());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public Lectures toEntity(Lectures entity, LectureDTO dto) {
		try {
			entity.setSurname(dto.getSurname());
			entity.setFirstName(dto.getFirstName());
			if (dto.getGender().equals("Nam")) {
				entity.setGender((long) 0);
			} else {
				entity.setGender((long) 1);
			}
			entity.setEmail(dto.getEmail());
			entity.setNumberPhone(dto.getNumberPhone());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public LectureDTO toDTO(Lectures entity) {
		LectureDTO dto = new LectureDTO();
		try {
			dto.setId(entity.getId());
			dto.setSurname(entity.getSurname());
			dto.setFirstName(entity.getFirstName());
			dto.setFullName(entity.getSurname() + " " + entity.getFirstName());
			if (entity.getGender() == 0) {
				dto.setGender("Nam");
			} else {
				dto.setGender("Nu");
			}
			dto.setEmail(entity.getEmail());
			dto.setNumberPhone(entity.getNumberPhone());
			dto.setPositionName(entity.getProsition().getNameProsition());
			dto.setSubjectName(entity.getSubject().getNameSubject());
			if (!entity.getListResearchs().isEmpty()) {
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
