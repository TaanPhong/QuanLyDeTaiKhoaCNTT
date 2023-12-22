package com.trantanphong.service;

import java.util.List;

import com.trantanphong.dto.StatisticalTotal;
import com.trantanphong.dto.SubjectDTO;
import com.trantanphong.dto.SubjectResearchStatistical;
import com.trantanphong.entity.Subject;

public interface SubjectService {
	List<SubjectDTO> getAll();
	Subject getSubject(String subjectName);
	//Subject getSubjectById()
	List<SubjectResearchStatistical> getStatistical(long schoolYearId);
	List<StatisticalTotal> getStatisticalTotals();
}
