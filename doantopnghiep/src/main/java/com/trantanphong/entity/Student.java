package com.trantanphong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(length = 10)
	private String studentCode;

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
	@JoinColumn(name = "class_id")
	@JsonManagedReference
	private Class classID;

	@OneToOne(mappedBy = "student")
	private Research research;

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
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

	public Class getClassID() {
		return classID;
	}

	public void setClassID(Class classID) {
		this.classID = classID;
	}

	public Research getResearch() {
		return research;
	}

	public void setResearch(Research research) {
		this.research = research;
	}

	public Student(String studentCode, String surname, String firstName, Long gender, String email, String numberPhone,
			Class classID, Research research) {
		super();
		this.studentCode = studentCode;
		this.surname = surname;
		this.firstName = firstName;
		this.gender = gender;
		this.email = email;
		this.numberPhone = numberPhone;
		this.classID = classID;
		this.research = research;
	}

	public Student() {
		super();
	}

}
