package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.PrositionDTO;
import com.trantanphong.entity.Prosition;

public interface PositionService {
	List<PrositionDTO> getAll();
	Prosition getPostion(String namePosition);
}
