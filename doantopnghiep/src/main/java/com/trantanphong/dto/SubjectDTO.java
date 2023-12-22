package com.trantanphong.dto;

import java.util.List;

public class SubjectDTO {
	private String subjectCode;
	private String subjectName;
	private List<ResearchDTO> researchDTOs;

	public List<ResearchDTO> getResearchDTOs() {
		return researchDTOs;
	}

	public void setResearchDTOs(List<ResearchDTO> researchDTOs) {
		this.researchDTOs = researchDTOs;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public SubjectDTO(String subjectCode, String subjectName) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
	}

	public SubjectDTO() {
		super();
	}

}
