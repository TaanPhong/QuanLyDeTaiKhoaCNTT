package com.trantanphong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "power")
public class Power {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String powerName;
	
	@ManyToOne
	@JoinColumn(name = "prosition_id")
	@JsonManagedReference
	private Prosition prosition;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public Prosition getProsition() {
		return prosition;
	}

	public void setProsition(Prosition prosition) {
		this.prosition = prosition;
	}

	public Power(Long id, String powerName, Prosition prosition) {
		super();
		this.id = id;
		this.powerName = powerName;
		this.prosition = prosition;
	}

	public Power() {
		super();
	}
	
}
