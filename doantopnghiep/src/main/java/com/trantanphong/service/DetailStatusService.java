package com.trantanphong.service;

import com.trantanphong.dto.DetailStatusDTO;

public interface DetailStatusService {
	DetailStatusDTO save(DetailStatusDTO dto);
	DetailStatusDTO getStatusNow(Long researchID);
	void delete(Long researchID);
}
