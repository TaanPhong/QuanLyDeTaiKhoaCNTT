package com.trantanphong.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "detail_status")
public class DetailStatus {
	@EmbeddedId
	private DetailStatusKey detailStatusKey;

	@ManyToOne
	@MapsId("statusID")
	@JoinColumn(name = "status_id")
	private ResearchStatus researchStatus;

	@ManyToOne
	@MapsId("researchID")
	@JoinColumn(name = "research_id")
	private Research research;

	@ManyToOne
	@JoinColumn(name = "lecture_id")
	@JsonManagedReference
	private Lectures lecture;

	public DetailStatusKey getDetailStatusKey() {
		return detailStatusKey;
	}

	public void setDetailStatusKey(DetailStatusKey detailStatusKey) {
		this.detailStatusKey = detailStatusKey;
	}

	public ResearchStatus getResearchStatus() {
		return researchStatus;
	}

	public void setResearchStatus(ResearchStatus researchStatus) {
		this.researchStatus = researchStatus;
	}

	public Research getResearch() {
		return research;
	}

	public void setResearch(Research research) {
		this.research = research;
	}

	public Lectures getLecture() {
		return lecture;
	}

	public void setLecture(Lectures lecture) {
		this.lecture = lecture;
	}

	public DetailStatus(DetailStatusKey detailStatusKey, ResearchStatus researchStatus, Research research,
			Lectures lecture) {
		super();
		this.detailStatusKey = detailStatusKey;
		this.researchStatus = researchStatus;
		this.research = research;
		this.lecture = lecture;
	}

	public DetailStatus() {
		super();
	}

}
