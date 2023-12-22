package com.trantanphong.dto;

import java.io.File;

public class StudentDTO {
	private String studentCode;
	private String surname;
	private String firstName;
	private String gender;
	private String email;
	private String numberPhone;
	private String fullName;
	private String classCode;
	private String subjectCode;
	private String subjectName;
	private String researchName;
	private long researchId;
	private boolean isUpdateResearch = false;
	private String reportDocumentCode;
	private String reportFile;

	public String getReportFile() {
		return reportFile;
	}

	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}

	public String getReportDocumentCode() {
		return reportDocumentCode;
	}

	public void setReportDocumentCode(String reportDocumentCode) {
		this.reportDocumentCode = reportDocumentCode;
	}

	public long getResearchId() {
		return researchId;
	}

	public void setResearchId(long researchId) {
		this.researchId = researchId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public boolean isUpdateResearch() {
		return isUpdateResearch;
	}

	public void setUpdateResearch(boolean isUpdateResearch) {
		this.isUpdateResearch = isUpdateResearch;
	}

	public String getResearchName() {
		return researchName;
	}

	public void setResearchName(String researchName) {
		this.researchName = researchName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public StudentDTO(String studentCode, String surname, String firstName, String gender, String email,
			String numberPhone) {
		super();
		this.studentCode = studentCode;
		this.surname = surname;
		this.firstName = firstName;
		this.gender = gender;
		this.email = email;
		this.numberPhone = numberPhone;
	}

	public StudentDTO() {
		super();
	}

}
