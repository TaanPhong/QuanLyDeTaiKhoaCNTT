package com.trantanphong.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DetailStatusKey implements Serializable {
	@Column(name = "status_id")
	private Long statusID;

	@Column(name = "research_id")
	private Long researchID;

	@Column(name = "date_change")
	private String dateChange;

	public Long getStatusID() {
		return statusID;
	}

	public void setStatusID(Long statusID) {
		this.statusID = statusID;
	}

	public Long getResearchID() {
		return researchID;
	}

	public void setResearchID(Long researchID) {
		this.researchID = researchID;
	}

	public String getDateChange() {
		return dateChange;
	}

	public void setDateChange(String dateChange) {
		this.dateChange = dateChange;
	}

	public DetailStatusKey(Long statusID, Long researchID, String dateChange) {
		super();
		this.statusID = statusID;
		this.researchID = researchID;
		this.dateChange = dateChange;
	}

	public DetailStatusKey() {
		super();
	}

}
