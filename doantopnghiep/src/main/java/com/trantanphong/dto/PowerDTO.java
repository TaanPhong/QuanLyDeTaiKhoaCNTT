package com.trantanphong.dto;

public class PowerDTO {
	private Long id;
	private String powerName;

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

	public PowerDTO(Long id, String powerName) {
		super();
		this.id = id;
		this.powerName = powerName;
	}

	public PowerDTO() {
		super();
	}

}
