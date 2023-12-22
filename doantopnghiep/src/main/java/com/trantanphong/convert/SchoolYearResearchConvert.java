package com.trantanphong.convert;

import java.math.BigInteger;

import javax.persistence.Tuple;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.SchoolYearResearch;

@Component
public class SchoolYearResearchConvert {
	public SchoolYearResearch toSchoolYearResearch(Tuple tuple)
	{
		SchoolYearResearch schoolYearResearch = new SchoolYearResearch();
		schoolYearResearch.setSubjectCode(tuple.get(0).toString());
		schoolYearResearch.setAcademicYear(((BigInteger) tuple.get(1)).longValue());
		schoolYearResearch.setNumberResearch(((BigInteger) tuple.get(2)).longValue());
		return schoolYearResearch;
	}
}
