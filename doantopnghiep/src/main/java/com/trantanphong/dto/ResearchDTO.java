package com.trantanphong.dto;

public class ResearchDTO {
	private String researchName;
	private String theoreticalContent;
	private String practiceContext;
	private String reportDocumentCode;
	private Long academicYear;
	private String schoolYearName;
	private String fullNameLecture;
	private String researchStatusName;
	private Long researchID;
	private String fullNameStudent;
	private String studentCode;
	private String note;
	private String reportFile;

	public String getReportFile() {
		return reportFile;
	}

	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReportDocumentCode() {
		return reportDocumentCode;
	}

	public void setReportDocumentCode(String reportDocumentCode) {
		this.reportDocumentCode = reportDocumentCode;
	}

	public String getFullNameStudent() {
		return fullNameStudent;
	}

	public void setFullNameStudent(String fullName) {
		this.fullNameStudent = fullName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public Long getResearchID() {
		return researchID;
	}

	public void setResearchID(Long researchID) {
		this.researchID = researchID;
	}

	public String getResearchName() {
		return researchName;
	}

	public void setResearchName(String researchName) {
		this.researchName = researchName;
	}

	public String getTheoreticalContent() {
		return theoreticalContent;
	}

	public void setTheoreticalContent(String theoreticalContent) {
		this.theoreticalContent = theoreticalContent;
	}

	public String getPracticeContext() {
		return practiceContext;
	}

	public void setPracticeContext(String practiceContext) {
		this.practiceContext = practiceContext;
	}

	public String getReportDocumnetCode() {
		return reportDocumentCode;
	}

	public void setReportDocumnetCode(String reportDocumnetCode) {
		this.reportDocumentCode = reportDocumnetCode;
	}

	public Long getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Long academicYear) {
		this.academicYear = academicYear;
	}

	public String getSchoolYearName() {
		return schoolYearName;
	}

	public void setSchoolYearName(String schoolYearName) {
		this.schoolYearName = schoolYearName;
	}

	public String getFullNameLecture() {
		return fullNameLecture;
	}

	public void setFullNameLecture(String fullNameLecture) {
		this.fullNameLecture = fullNameLecture;
	}

	public String getResearchStatusName() {
		return researchStatusName;
	}

	public void setResearchStatusName(String researchStatusName) {
		this.researchStatusName = researchStatusName;
	}

	public ResearchDTO() {
		super();
	}

}
