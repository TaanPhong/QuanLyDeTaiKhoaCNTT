package com.trantanphong.dto;

public class SchoolYearDTO {
	private Long id;
	private String schoolYearName;
	private Long academicYear;
	private int lengthResearch = 0;
	private String dateStart;
	private String dateEnd;

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public int getLengthResearch() {
		return lengthResearch;
	}

	public void setLengthResearch(int lengthResearch) {
		this.lengthResearch = lengthResearch;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSchoolYearName() {
		return schoolYearName;
	}

	public void setSchoolYearName(String schoolYearName) {
		this.schoolYearName = schoolYearName;
	}

	public Long getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Long academicYear) {
		this.academicYear = academicYear;
	}

	public SchoolYearDTO(Long id, String schoolYearName, Long academicYear) {
		super();
		this.id = id;
		this.schoolYearName = schoolYearName;
		this.academicYear = academicYear;
	}

	public SchoolYearDTO() {
		super();
	}

}
