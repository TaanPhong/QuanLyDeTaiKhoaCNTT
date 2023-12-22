package com.trantanphong.convert;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.AccountDTO;
import com.trantanphong.entity.Acount;

@Component
public class AccountConvert {
	public Acount toEntity(AccountDTO dto) {
		Acount entity = new Acount();
		try {
			entity.setUsername(dto.getUsername());
			entity.setPassword(dto.getPassword());
			entity.setChange(dto.isChange());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public Acount toEntity(Acount entity, AccountDTO dto) {
		try {
			entity.setUsername(dto.getUsername());
			entity.setPassword(dto.getPassword());
			entity.setChange(dto.isChange());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return entity;
	}
	
	public AccountDTO toDTO(Acount entity) {
		AccountDTO dto = new AccountDTO();
		try {
			dto.setUseranme(entity.getUsername());
			dto.setPassword(entity.getPassword());
			dto.setIdLecture(entity.getLecture().getId());
			dto.setPositionName(entity.getLecture().getProsition().getNameProsition());
			dto.setFullName(entity.getLecture().getSurname() + " " + entity.getLecture().getFirstName());
			dto.setSubjectCode(entity.getLecture().getSubject().getSubject_code());
			dto.setChange(entity.isChange());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dto;
	}
}
