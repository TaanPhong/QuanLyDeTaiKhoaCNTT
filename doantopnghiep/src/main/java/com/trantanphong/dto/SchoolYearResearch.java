package com.trantanphong.dto;

public class SchoolYearResearch {
	private Long academicYear;
	private Long numberResearch;
	private String subjectCode;

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public void setAcademicYear(Long academicYear) {
		this.academicYear = academicYear;
	}

	public long getAcademicYear() {
		return academicYear;
	}

	public long getNumberResearch() {
		return numberResearch;
	}

	public void setNumberResearch(Long numberResearch) {
		this.numberResearch = numberResearch;
	}

	public SchoolYearResearch(long academicYear, long numberResearch) {
		super();
		this.academicYear = academicYear;
		this.numberResearch = numberResearch;
	}

	public SchoolYearResearch() {
		super();
	}

}
