package com.trantanphong.dto;

import java.util.List;

public class ClassDTO {
	private String classCode;
	private String className;
	private String subjectName;
	private List<StudentDTO> studentDTOs;

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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<StudentDTO> getStudentDTOs() {
		return studentDTOs;
	}

	public void setStudentDTOs(List<StudentDTO> studentDTOs) {
		this.studentDTOs = studentDTOs;
	}

	public ClassDTO(String classCode, String className) {
		super();
		this.classCode = classCode;
		this.className = className;
	}

	public ClassDTO() {
		super();
	}

}
