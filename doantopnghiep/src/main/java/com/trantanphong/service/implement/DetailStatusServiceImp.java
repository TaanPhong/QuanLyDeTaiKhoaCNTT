package com.trantanphong.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.DetailStatusConvert;
import com.trantanphong.dto.DetailStatusDTO;
import com.trantanphong.entity.DetailStatus;
import com.trantanphong.entity.Lectures;
import com.trantanphong.entity.Research;
import com.trantanphong.entity.ResearchStatus;
import com.trantanphong.repository.DetailStatusRepository;
import com.trantanphong.repository.LectureRepository;
import com.trantanphong.repository.ResearchRepository;
import com.trantanphong.repository.ResearchStatusRepository;
import com.trantanphong.service.DetailStatusService;

@Service
public class DetailStatusServiceImp implements DetailStatusService{

	@Autowired
	private DetailStatusRepository detailStatusRepository;
	@Autowired
	private DetailStatusConvert detailStatusConvert;
	
	@Autowired
	private ResearchRepository researchRepository;
	
	@Autowired
	private ResearchStatusRepository researchStatusRepository;
	
	@Autowired
	private LectureRepository lectureRepository;
	
	@Override
	public DetailStatusDTO save(DetailStatusDTO dto) {
		// TODO Auto-generated method stub
		DetailStatus newEntity = detailStatusConvert.toEntity(dto);
		Lectures lectures = lectureRepository.findById(dto.getIdLecture()).orElse(null);
		Research research = researchRepository.findById(dto.getResearch()).orElse(null);
		ResearchStatus status = researchStatusRepository.findById(dto.getStatusID()).orElse(null);
		newEntity.setResearch(research);
		newEntity.setResearchStatus(status);
		newEntity.setLecture(lectures);
		newEntity = detailStatusRepository.save(newEntity);
		return detailStatusConvert.toDTO(newEntity);
	}

	@Override
	public DetailStatusDTO getStatusNow(Long researchID) {
		// TODO Auto-generated method stub
		DetailStatus status = detailStatusRepository.getStatusNow(researchID);
		return detailStatusConvert.toDTO(status);
	}

	@Override
	public void delete(Long researchID) {
		// TODO Auto-generated method stub
		List<DetailStatus> listDetailStatus = detailStatusRepository.findAllByResearchID(researchID);
		for (DetailStatus detailStatus : listDetailStatus) {
			detailStatusRepository.deleteById(detailStatus.getDetailStatusKey());
		}
	}
	
}
