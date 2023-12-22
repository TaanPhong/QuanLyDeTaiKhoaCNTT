package com.trantanphong.convert;

import java.math.BigInteger;

import javax.persistence.Tuple;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.SubjectResearchStatistical;

@Component
public class SubjectResearchStatisticalConvert {
	public SubjectResearchStatistical toSubjectResearchStatistical(Tuple tuple) {
		SubjectResearchStatistical subjectResearchStatistical = new SubjectResearchStatistical();
		subjectResearchStatistical.setSubject_code(tuple.get(0).toString());
		subjectResearchStatistical.setNumber_research(((BigInteger) tuple.get(1)).longValue());
		subjectResearchStatistical.setNumberComplete(((BigInteger) tuple.get(2)).longValue());
		return subjectResearchStatistical;
	}
}
