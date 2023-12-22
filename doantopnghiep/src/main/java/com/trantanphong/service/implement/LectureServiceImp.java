	package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trantanphong.convert.LectureConvert;
import com.trantanphong.dto.AccountDTO;
import com.trantanphong.dto.LectureDTO;
import com.trantanphong.dto.ResearchDTO;
import com.trantanphong.entity.Lectures;
import com.trantanphong.entity.Prosition;
import com.trantanphong.entity.Subject;
import com.trantanphong.repository.LectureRepository;
import com.trantanphong.service.AccountService;
import com.trantanphong.service.DetailStatusService;
import com.trantanphong.service.LectureService;
import com.trantanphong.service.PositionService;
import com.trantanphong.service.SubjectService;

@Service
public class LectureServiceImp implements LectureService {

	@Autowired
	private LectureRepository lectureRepository;

	@Autowired
	private DetailStatusService detailStatusService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private PositionService positionService;

	@Autowired
	private SubjectService subjectService;

	@Autowired
	private LectureConvert lectureConvert;

	@Override
	public List<LectureDTO> getAllLectures() {
		// TODO Auto-generated method stub
		List<Lectures> lectures = lectureRepository.findAll();
		List<LectureDTO> lectureDTOs = new ArrayList<>();
		for (Lectures element : lectures) {
			LectureDTO dto = lectureConvert.toDTO(element);
			if (dto.getResearchDTOs() != null) {
				for (ResearchDTO researchDTO : dto.getResearchDTOs()) {
					researchDTO.setResearchStatusName(
							detailStatusService.getStatusNow(researchDTO.getResearchID()).getStatusName());
				}
			}
			lectureDTOs.add(dto);
		}
		return lectureDTOs;
	}

	@Override
	public LectureDTO save(LectureDTO dto) {
		// TODO Auto-generated method stub
		Lectures newEntity = new Lectures();
		Prosition prosition = positionService.getPostion(dto.getPositionName());
		Subject subject = subjectService.getSubject(dto.getSubjectName());
		if (dto.getId() != null) {
			Lectures oldEntity = lectureRepository.findById(dto.getId()).orElse(null);
			newEntity = lectureConvert.toEntity(oldEntity, dto);
		} else {
			newEntity = lectureConvert.toEntity(dto);
			AccountDTO accounDTO = new AccountDTO();
			accounDTO.setUseranme(dto.getEmail());
			accounDTO.setPassword("");
			accountService.save(accounDTO);
			newEntity.setAcount(accountService.findAccount(accounDTO.getUsername()));
		}
		newEntity.setProsition(prosition);
		newEntity.setSubject(subject);
		newEntity = lectureRepository.save(newEntity);
		return lectureConvert.toDTO(newEntity);
	}

	@Override
	public LectureDTO getLecture(String username) {
		// TODO Auto-generated method stub
		Lectures entity = lectureRepository.findByEmail(username);
		if (entity == null)
			return null;
		LectureDTO lectureDTO = lectureConvert.toDTO(entity);
		if (lectureDTO.getResearchDTOs() != null) {
			for (ResearchDTO element : lectureDTO.getResearchDTOs()) {
				element.setResearchStatusName(
						detailStatusService.getStatusNow(element.getResearchID()).getStatusName());
			}
		}
		return lectureDTO;
	}

	@Override
	public LectureDTO getLectureById(long id) {

		// TODO Auto-generated method stub
		Lectures entity = lectureRepository.findById(id).orElse(null);
		if (entity != null) {
			return lectureConvert.toDTO(entity);
		}
		return null;
	}

	@Override
	public List<LectureDTO> getAllLecturesBySubjectCode(String subjectCode) {
		// TODO Auto-generated method stub
		List<Lectures> lectures = lectureRepository.getAllLecturesBySubjectCode(subjectCode);
		List<LectureDTO> lectureDTOs = new ArrayList<>();
		for (Lectures element : lectures) {
			LectureDTO dto = lectureConvert.toDTO(element);
			if (dto.getResearchDTOs() != null) {
				for (ResearchDTO researchDTO : dto.getResearchDTOs()) {
					researchDTO.setResearchStatusName(
							detailStatusService.getStatusNow(researchDTO.getResearchID()).getStatusName());
				}
			}
			lectureDTOs.add(dto);
		}
		return lectureDTOs;
	}

}
