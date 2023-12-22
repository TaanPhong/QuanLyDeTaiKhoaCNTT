package com.trantanphong.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
	@Id
	@Column(length = 5)
	private String subject_code;

	@Column(nullable = false, unique = true, length = 50)
	private String nameSubject;

	@OneToMany(mappedBy = "subject")
	private List<Class> listClass;

	@OneToMany(mappedBy = "subject")
	private List<Lectures> listLectures;

	@OneToMany(mappedBy = "subject")
	private List<Research> listResearchs;

	public Subject(String subject_code, String nameSubject, List<Class> listClass, List<Lectures> listLectures,
			List<Research> listResearchs) {
		super();
		this.subject_code = subject_code;
		this.nameSubject = nameSubject;
		this.listClass = listClass;
		this.listLectures = listLectures;
		this.listResearchs = listResearchs;
	}

	public String getSubject_code() {
		return subject_code;
	}

	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}

	public String getNameSubject() {
		return nameSubject;
	}

	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}

	public List<Class> getListClass() {
		return listClass;
	}

	public void setListClass(List<Class> listClass) {
		this.listClass = listClass;
	}

	public List<Lectures> getListLectures() {
		return listLectures;
	}

	public void setListLectures(List<Lectures> listLectures) {
		this.listLectures = listLectures;
	}

	public List<Research> getListResearchs() {
		return listResearchs;
	}

	public void setListResearchs(List<Research> listResearchs) {
		this.listResearchs = listResearchs;
	}

	public Subject() {
		super();
	}
	
}
