package com.trantanphong.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "lectures")
public class Lectures {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50, nullable = false)
	private String surname;

	@Column(length = 30, nullable = false)
	private String firstName;

	@Column
	private Long gender;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false, unique = true, length = 10)
	private String numberPhone;

	@ManyToOne
	@JoinColumn(name = "prosition_id")
	@JsonManagedReference
	private Prosition prosition;

	@ManyToOne
	@JoinColumn(name = "subject_id")
	@JsonManagedReference
	private Subject subject;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "acount_id", referencedColumnName = "username")
	private Acount acount;

	@OneToMany(mappedBy = "lecture")
	private List<Research> listResearchs;

	@OneToMany(mappedBy = "lecture")
	private List<DetailStatus> listDetailStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getGender() {
		return gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public Prosition getProsition() {
		return prosition;
	}

	public void setProsition(Prosition prosition) {
		this.prosition = prosition;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Acount getAcount() {
		return acount;
	}

	public void setAcount(Acount acount) {
		this.acount = acount;
	}

	public List<Research> getListResearchs() {
		return listResearchs;
	}

	public void setListResearchs(List<Research> listResearchs) {
		this.listResearchs = listResearchs;
	}

	public List<DetailStatus> getListDetailStatus() {
		return listDetailStatus;
	}

	public void setListDetailStatus(List<DetailStatus> listDetailStatus) {
		this.listDetailStatus = listDetailStatus;
	}

	public Lectures(Long id, String surname, String firstName, Long gender, String email, String numberPhone,
			Prosition prosition, Subject subject, Acount acount, List<Research> listResearchs,
			List<DetailStatus> listDetailStatus) {
		super();
		this.id = id;
		this.surname = surname;
		this.firstName = firstName;
		this.gender = gender;
		this.email = email;
		this.numberPhone = numberPhone;
		this.prosition = prosition;
		this.subject = subject;
		this.acount = acount;
		this.listResearchs = listResearchs;
		this.listDetailStatus = listDetailStatus;
	}

	public Lectures() {
		// TODO Auto-generated constructor stub
	}

}
