package com.trantanphong.dto;

public class AccountDTO {
	private String username;
	private String password;
	private Long idLecture;
	private String positionName;
	private String fullName;
	private String subjectCode;
	private boolean isChange;

	public boolean isChange() {
		return isChange;
	}

	public void setChange(boolean isChange) {
		this.isChange = isChange;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUseranme(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getIdLecture() {
		return idLecture;
	}

	public void setIdLecture(Long idLecture) {
		this.idLecture = idLecture;
	}

	public AccountDTO() {
		super();
	}

}
