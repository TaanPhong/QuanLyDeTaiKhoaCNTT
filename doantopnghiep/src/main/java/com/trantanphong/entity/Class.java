package com.trantanphong.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "class")
public class Class {
	@Id
	@Column(length = 13)
	private String classCode;

	@Column(nullable = false, unique = true)
	private String className;

	@ManyToOne
	@JoinColumn(name = "subject_id")
	@JsonManagedReference
	private Subject subject;

	@OneToMany(mappedBy = "classID")
	private List<Student> listStudents;

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<Student> getListStudents() {
		return listStudents;
	}

	public void setListStudents(List<Student> listStudents) {
		this.listStudents = listStudents;
	}

	public Class(String classCode, String className, Subject subject, List<Student> listStudents) {
		super();
		this.classCode = classCode;
		this.className = className;
		this.subject = subject;
		this.listStudents = listStudents;
	}

	public Class() {
		super();
	}

}
