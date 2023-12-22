package com.trantanphong.dto;

import java.util.List;

public class PrositionDTO {
	private Long id;
	private String namePosition;
	private List<LectureDTO> lectureDTOs;
	private List<PowerDTO> powerDTOs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamePosition() {
		return namePosition;
	}

	public void setNamePosition(String namePosition) {
		this.namePosition = namePosition;
	}

	public PrositionDTO(Long id, String namePosition) {
		super();
		this.id = id;
		this.namePosition = namePosition;
	}

	public List<LectureDTO> getLectureDTOs() {
		return lectureDTOs;
	}

	public void setLectureDTOs(List<LectureDTO> lectureDTOs) {
		this.lectureDTOs = lectureDTOs;
	}

	public List<PowerDTO> getPowerDTOs() {
		return powerDTOs;
	}

	public void setPowerDTOs(List<PowerDTO> powerDTOs) {
		this.powerDTOs = powerDTOs;
	}

	public PrositionDTO() {
		super();
	}

}
