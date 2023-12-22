package com.trantanphong.convert;

import java.math.BigInteger;

import javax.persistence.Tuple;

import org.springframework.stereotype.Component;

import com.trantanphong.dto.StatisticalTotal;

@Component
public class StatisticalTotalConvert {
	public StatisticalTotal toDTO(Tuple tuple) {
		StatisticalTotal statisticalTotal = new StatisticalTotal();
		statisticalTotal.setSubjectCode(tuple.get(0).toString());
		statisticalTotal.setAcademicYear(((BigInteger) tuple.get(1)).longValue());
		statisticalTotal.setNumberResearch(((BigInteger) tuple.get(2)).longValue());
		statisticalTotal.setNumberStudent(((BigInteger) tuple.get(2)).longValue());
		statisticalTotal.setNumberStudentPreform(((BigInteger) tuple.get(3)).longValue());
		statisticalTotal.setNumberStudentGiveUp(statisticalTotal.getNumberStudent() - statisticalTotal.getNumberStudentPreform());
		return statisticalTotal;
	}
}
