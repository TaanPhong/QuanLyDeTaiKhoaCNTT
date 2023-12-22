package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.StatisticalTotalConvert;
import com.trantanphong.convert.SubjectConvert;
import com.trantanphong.convert.SubjectResearchStatisticalConvert;
import com.trantanphong.dto.StatisticalTotal;
import com.trantanphong.dto.SubjectDTO;
import com.trantanphong.dto.SubjectResearchStatistical;
import com.trantanphong.entity.Subject;
import com.trantanphong.repository.SubjectRepository;
import com.trantanphong.service.SubjectService;

@Service
public class SubjectServiceImp implements SubjectService{

	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private SubjectConvert subjectConvert;
	
	@Autowired
	private SubjectResearchStatisticalConvert statisticalConvert;
	
	@Autowired
	private StatisticalTotalConvert statisticalTotalConvert;

	@Override
	public List<SubjectDTO> getAll() {
		// TODO Auto-generated method stub
		List<Subject> subjects = subjectRepository.findAll();
		List<SubjectDTO> subjectDTOs = new ArrayList<>();
		for (Subject subject : subjects) {
			SubjectDTO dto = subjectConvert.toDTO(subject);
			subjectDTOs.add(dto);
		}
		return subjectDTOs;
	}

	@Override
	public Subject getSubject(String subjectName) {
		// TODO Auto-generated method stub
		Subject subject = subjectRepository.findByNameSubject(subjectName).orElse(null);
		return subject;
	}

	@Override
	public List<SubjectResearchStatistical> getStatistical(long schoolYearId) {
		// TODO Auto-generated method stub
		List<Tuple> getStatistical = subjectRepository.statisticalSubjectResearch(schoolYearId);
		List<SubjectResearchStatistical> subjectResearchStatisticals = new ArrayList<>();
		for (Tuple tuple : getStatistical) {
			SubjectResearchStatistical subjectResearchStatistical = statisticalConvert.toSubjectResearchStatistical(tuple);
			subjectResearchStatisticals.add(subjectResearchStatistical);
		}
		return subjectResearchStatisticals;
	}

	@Override
	public List<StatisticalTotal> getStatisticalTotals() {
		// TODO Auto-generated method stub
		List<Tuple> getTuples = subjectRepository.statisticalTotals();
		List<StatisticalTotal> statisticalTotals = new ArrayList<>();
		for (Tuple tuple : getTuples) {
			StatisticalTotal element = statisticalTotalConvert.toDTO(tuple);
			statisticalTotals.add(element);
		}
		return statisticalTotals;
	}

}
