package com.trantanphong.dto;

public class StatisticalTotal {
	private long academicYear;
	private String subjectCode;
	private long numberResearch;
	private long numberStudent;
	private long numberStudentPreform;
	private long numberStudentGiveUp;

	public long getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(long academicYear) {
		this.academicYear = academicYear;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public long getNumberResearch() {
		return numberResearch;
	}

	public void setNumberResearch(long numberResearch) {
		this.numberResearch = numberResearch;
	}

	public long getNumberStudent() {
		return numberStudent;
	}

	public void setNumberStudent(long numberStudent) {
		this.numberStudent = numberStudent;
	}

	public long getNumberStudentPreform() {
		return numberStudentPreform;
	}

	public void setNumberStudentPreform(long numberStudentPreform) {
		this.numberStudentPreform = numberStudentPreform;
	}

	public long getNumberStudentGiveUp() {
		return numberStudentGiveUp;
	}

	public void setNumberStudentGiveUp(long numberStudentGiveUp) {
		this.numberStudentGiveUp = numberStudentGiveUp;
	}

	public StatisticalTotal(long academicYear, String subjectCode, long numberResearch, long numberStudent,
			long numberStudentPreform, long numberStudentGiveUp) {
		super();
		this.academicYear = academicYear;
		this.subjectCode = subjectCode;
		this.numberResearch = numberResearch;
		this.numberStudent = numberStudent;
		this.numberStudentPreform = numberStudentPreform;
		this.numberStudentGiveUp = numberStudentGiveUp;
	}

	public StatisticalTotal() {
		super();
	}

}
