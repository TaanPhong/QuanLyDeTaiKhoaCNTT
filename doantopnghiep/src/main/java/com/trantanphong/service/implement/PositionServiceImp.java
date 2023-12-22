package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.PrositionConvert;
import com.trantanphong.dto.PrositionDTO;
import com.trantanphong.entity.Prosition;
import com.trantanphong.repository.PrositionRepository;
import com.trantanphong.service.PositionService;


@Service
public class PositionServiceImp implements PositionService{

	@Autowired
	private PrositionRepository prositionRepository;
	
	@Autowired
	private PrositionConvert prositionConvert;
	
	@Override
	public List<PrositionDTO> getAll() {
		// TODO Auto-generated method stub
		List<Prosition> prositions = prositionRepository.findAll();
		List<PrositionDTO> prositionDTOs = new ArrayList<>();
		for (Prosition prosition : prositions) {
			PrositionDTO dto = prositionConvert.toDTO(prosition);
			prositionDTOs.add(dto);
		}	
		return prositionDTOs;
	}

	@Override
	public Prosition getPostion(String namePosition) {
		// TODO Auto-generated method stub
		Prosition prosition = prositionRepository.findByNameProsition(namePosition);
		return prosition;
	}

}
