package com.trantanphong.dto;

public class DetailStatusDTO {
	private Long statusID;
	private Long research;
	private String dateChange;
	private Long idLecture;
	private String fullNameLecture;
	private String statusName;

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Long getStatusID() {
		return statusID;
	}

	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}

	public Long getResearch() {
		return research;
	}

	public void setResearch(Long research) {
		this.research = research;
	}

	public String getDateChange() {
		return dateChange;
	}

	public void setDateChange(String dateChange) {
		this.dateChange = dateChange;
	}

	public Long getIdLecture() {
		return idLecture;
	}

	public void setIdLecture(Long idLecture) {
		this.idLecture = idLecture;
	}

	public String getFullNameLecture() {
		return fullNameLecture;
	}

	public void setFullNameLecture(String fullNameLecture) {
		this.fullNameLecture = fullNameLecture;
	}

	public DetailStatusDTO(Long statusID, Long research, String dateChange, Long idLecture, String fullNameLecture) {
		super();
		this.statusID = statusID;
		this.research = research;
		this.dateChange = dateChange;
		this.idLecture = idLecture;
		this.fullNameLecture = fullNameLecture;
	}

	public DetailStatusDTO() {
		super();
	}

}
