package com.trantanphong.dto;

public class SubjectResearchStatistical {
	private String subject_code;
	private Long number_research;
	private Long numberComplete;

	public Long getNumberComplete() {
		return numberComplete;
	}

	public void setNumberComplete(Long numberComplete) {
		this.numberComplete = numberComplete;
	}

	public String getSubject_code() {
		return subject_code;
	}

	public void setSubject_code(String subject_code) {
		this.subject_code = subject_code;
	}

	public Long getNumber_research() {
		return number_research;
	}

	public void setNumber_research(Long number_research) {
		this.number_research = number_research;
	}

	public SubjectResearchStatistical() {
		super();
	}

}
