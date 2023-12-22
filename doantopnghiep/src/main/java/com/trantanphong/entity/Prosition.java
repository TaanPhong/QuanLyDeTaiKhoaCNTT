package com.trantanphong.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prosition")
public class Prosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name_prosition", unique = true, nullable = false, length = 50)
	private String nameProsition;

	@OneToMany(mappedBy = "prosition")
	private List<Power> listPower;

	@OneToMany(mappedBy = "prosition")
	private List<Lectures> listLectures;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameProsition() {
		return nameProsition;
	}

	public void setNameProsition(String nameProsition) {
		this.nameProsition = nameProsition;
	}

	public List<Power> getListPower() {
		return listPower;
	}

	public void setListPower(List<Power> listPower) {
		this.listPower = listPower;
	}

	public List<Lectures> getListLectures() {
		return listLectures;
	}

	public void setListLectures(List<Lectures> listLectures) {
		this.listLectures = listLectures;
	}

	public Prosition(Long id, String nameProsition, List<Power> listPower, List<Lectures> listLectures) {
		super();
		this.id = id;
		this.nameProsition = nameProsition;
		this.listPower = listPower;
		this.listLectures = listLectures;
	}

	public Prosition() {
		super();
	}

}
