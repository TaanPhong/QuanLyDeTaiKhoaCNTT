package com.trantanphong.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trantanphong.dto.LectureDTO;
import com.trantanphong.dto.PowerDTO;
import com.trantanphong.dto.PrositionDTO;
import com.trantanphong.entity.Lectures;
import com.trantanphong.entity.Power;
import com.trantanphong.entity.Prosition;

@Component
public class PrositionConvert {
	@Autowired
	private LectureConvert lectureConvert;
	@Autowired
	private PowerConvert powerConvert;

	public Prosition toEntity(PrositionDTO dto) {
		Prosition entity = new Prosition();
		try {
			entity.setNameProsition(dto.getNamePosition());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public Prosition toEntity(Prosition entity, PrositionDTO dto) {
		try {
			entity.setId(dto.getId());
			entity.setNameProsition(dto.getNamePosition());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}

	public PrositionDTO toDTO(Prosition entity) {
		PrositionDTO dto = new PrositionDTO();
		try {
			dto.setId(entity.getId());
			dto.setNamePosition(entity.getNameProsition());
			if (!entity.getListLectures().isEmpty()) {
				List<LectureDTO> lectureDTOs = new ArrayList<>();
				for (Lectures element : entity.getListLectures()) {
					LectureDTO newDTO = lectureConvert.toDTO(element);
					lectureDTOs.add(newDTO);
				}
				dto.setLectureDTOs(lectureDTOs);
			}
			if (!entity.getListPower().isEmpty()) {
				List<PowerDTO> powerDTOs = new ArrayList<>();
				for (Power element : entity.getListPower()) {
					PowerDTO newDTO = powerConvert.toDTO(element);
					powerDTOs.add(newDTO);
				}
				dto.setPowerDTOs(powerDTOs);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
