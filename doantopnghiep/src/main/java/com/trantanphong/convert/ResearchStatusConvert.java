package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.ResearchStatusDTO;
import com.trantanphong.entity.ResearchStatus;

@Component
public class ResearchStatusConvert {
	public ResearchStatus toEntity(ResearchStatusDTO dto) {
		ResearchStatus entity = new ResearchStatus();
		try {
			entity.setStatusName(dto.getStatusName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public ResearchStatus toEntity(ResearchStatus entity, ResearchStatusDTO dto) {
		//ResearchStatus entity = new ResearchStatus();
		try {
			entity.setId(dto.getId());
			entity.setStatusName(dto.getStatusName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public ResearchStatusDTO toDTO(ResearchStatus entity) {
		ResearchStatusDTO dto = new ResearchStatusDTO();
		try {
			dto.setId(entity.getId());
			dto.setStatusName(entity.getStatusName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
