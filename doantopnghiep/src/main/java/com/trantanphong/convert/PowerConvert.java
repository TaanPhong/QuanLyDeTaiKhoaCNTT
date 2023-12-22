package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.PowerDTO;
import com.trantanphong.entity.Power;

@Component
public class PowerConvert {
	public Power toEntity(PowerDTO dto) {
		Power entity = new Power();
		try {
			entity.setPowerName(dto.getPowerName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public Power toEntity(Power entity, PowerDTO dto) {
		try {
			entity.setPowerName(dto.getPowerName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public PowerDTO toDTO(Power entity) {
		PowerDTO dto = new PowerDTO();
		try {
			dto.setId(entity.getId());
			dto.setPowerName(entity.getPowerName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
