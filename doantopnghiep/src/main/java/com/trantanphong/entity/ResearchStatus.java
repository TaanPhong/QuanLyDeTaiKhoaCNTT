package com.trantanphong.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "research_status")
public class ResearchStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String statusName;

	@ManyToMany(mappedBy = "researchStatus")
	private Set<Research> researchs;

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

	public Set<Research> getResearchs() {
		return researchs;
	}

	public void setResearchs(Set<Research> researchs) {
		this.researchs = researchs;
	}

	public ResearchStatus(Long id, String statusName, Set<Research> researchs) {
		super();
		this.id = id;
		this.statusName = statusName;
		this.researchs = researchs;
	}

	public ResearchStatus() {
		super();
	}

}
