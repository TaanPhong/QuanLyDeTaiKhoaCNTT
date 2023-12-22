package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.ResearchStatusConvert;
import com.trantanphong.dto.ResearchStatusDTO;
import com.trantanphong.entity.ResearchStatus;
import com.trantanphong.repository.ResearchStatusRepository;
import com.trantanphong.service.ResearchStatusService;

@Service
public class ResearchStatusServiceImp implements ResearchStatusService {

	@Autowired
	private ResearchStatusRepository researchStatusRepository;
	
	@Autowired
	private ResearchStatusConvert researchStatusConvert;

	@Override
	public List<ResearchStatusDTO> getAll() {
		// TODO Auto-generated method stub
		List<ResearchStatusDTO> researchStatusDTOs = new ArrayList<>();
		List<ResearchStatus> researchStatus = researchStatusRepository.findAll();
		for (ResearchStatus researchStatus2 : researchStatus) {
			ResearchStatusDTO dto = researchStatusConvert.toDTO(researchStatus2);
			researchStatusDTOs.add(dto);
		}
		return researchStatusDTOs;
	}

}
