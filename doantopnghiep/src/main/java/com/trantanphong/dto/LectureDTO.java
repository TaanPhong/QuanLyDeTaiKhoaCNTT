package com.trantanphong.dto;

import java.util.List;

public class LectureDTO {
	private String surname;
	private String firstName;
	private String gender;
	private String email;
	private String numberPhone;
	private String positionName;
	private String subjectName;
	private List<ResearchDTO> researchDTOs;
	private String fullName;
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<ResearchDTO> getResearchDTOs() {
		return researchDTOs;
	}

	public void setResearchDTOs(List<ResearchDTO> researchDTOs) {
		this.researchDTOs = researchDTOs;
	}

	public LectureDTO() {
		super();
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
