package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.DetailStatusDTO;
import com.trantanphong.entity.DetailStatus;
import com.trantanphong.entity.DetailStatusKey;

@Component
public class DetailStatusConvert {
	public DetailStatus toEntity(DetailStatusDTO dto) {
		DetailStatus entity = new DetailStatus();
		try {
			DetailStatusKey key =  new DetailStatusKey();
			key.setDateChange(dto.getDateChange());
			key.setResearchID(dto.getResearch());
			key.setStatusID(dto.getStatusID());
			entity.setDetailStatusKey(key);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public DetailStatus toEntity(DetailStatus entity, DetailStatusDTO dto) {
		try {
			DetailStatusKey key =  new DetailStatusKey();
			key.setDateChange(dto.getDateChange());
			key.setResearchID(dto.getResearch());
			key.setStatusID(dto.getStatusID());
			entity.setDetailStatusKey(key);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public DetailStatusDTO toDTO(DetailStatus entity) {
		DetailStatusDTO dto = new DetailStatusDTO();
		try {
			dto.setDateChange(entity.getDetailStatusKey().getDateChange());
			dto.setFullNameLecture(entity.getLecture().getSurname() + " " + entity.getLecture().getFirstName());
			dto.setIdLecture(entity.getLecture().getId());
			dto.setResearch(entity.getResearch().getId());
			dto.setStatusID(entity.getResearchStatus().getId());
			dto.setStatusName(entity.getResearchStatus().getStatusName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
