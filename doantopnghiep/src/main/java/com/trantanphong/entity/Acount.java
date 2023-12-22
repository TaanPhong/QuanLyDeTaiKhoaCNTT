package com.trantanphong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "acount")
public class Acount {
	@Id
	private String username;

	@Column(nullable = false)
	private String password;

	@OneToOne(mappedBy = "acount")
	private Lectures lecture;

	@Column
	private boolean isChange = false;

	public boolean isChange() {
		return isChange;
	}

	public void setChange(boolean isChange) {
		this.isChange = isChange;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Lectures getLecture() {
		return lecture;
	}

	public void setLecture(Lectures lecture) {
		this.lecture = lecture;
	}

	public Acount(String username, String password, Lectures lecture) {
		super();
		this.username = username;
		this.password = password;
		this.lecture = lecture;
	}

	public Acount() {
		super();
	}

}
