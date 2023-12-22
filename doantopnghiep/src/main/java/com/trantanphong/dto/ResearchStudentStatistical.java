package com.trantanphong.dto;

public class ResearchStudentStatistical {
	private String researchName;
	private String schoolYearName;
	private String statusName;
	private String fullNameStudent;

	public String getResearchName() {
		return researchName;
	}

	public void setResearchName(String researchName) {
		this.researchName = researchName;
	}

	public String getSchoolYearName() {
		return schoolYearName;
	}

	public void setSchoolYearName(String schoolYearName) {
		this.schoolYearName = schoolYearName;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getFullNameStudent() {
		return fullNameStudent;
	}

	public void setFullNameStudent(String fullNameStudent) {
		this.fullNameStudent = fullNameStudent;
	}

	public ResearchStudentStatistical() {
		super();
	}

	public ResearchStudentStatistical(String researchName, String schoolYearName, String statusName,
			String fullNameStudent) {
		super();
		this.researchName = researchName;
		this.schoolYearName = schoolYearName;
		this.statusName = statusName;
		this.fullNameStudent = fullNameStudent;
	}

}
