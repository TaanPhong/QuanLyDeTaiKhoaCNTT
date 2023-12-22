package com.trantanphong.dto;

public class ResearchStatusDTO {
	private Long id;
	private String statusName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public ResearchStatusDTO() {
		super();
	}

	public ResearchStatusDTO(Long id, String statusName) {
		super();
		this.id = id;
		this.statusName = statusName;
	}

}
