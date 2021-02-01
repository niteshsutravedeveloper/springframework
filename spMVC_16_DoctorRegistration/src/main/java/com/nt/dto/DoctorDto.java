package com.nt.dto;

import javax.persistence.Column;

public class DoctorDto {
	private Integer doctorId;
	
	private String doctorName;
	
	private Integer age;
	
	private String specialists;
	
	private String address;
	
	private Integer experience;
	
	private String phoneNumber;

	public DoctorDto(Integer doctorId, String doctorName, Integer age, String specialists, String address,
			Integer experience, String phoneNumber) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.age = age;
		this.specialists = specialists;
		this.address = address;
		this.experience = experience;
		this.phoneNumber = phoneNumber;
	}

	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setSpecialists(String specialists) {
		this.specialists = specialists;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public Integer getAge() {
		return age;
	}

	public String getSpecialists() {
		return specialists;
	}

	public String getAddress() {
		return address;
	}

	public Integer getExperience() {
		return experience;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public String toString() {
		return "DoctorDto [doctorId=" + doctorId + ", doctorName=" + doctorName + ", age=" + age + ", specialists="
				+ specialists + ", address=" + address + ", experience=" + experience + ", phoneNumber=" + phoneNumber
				+ "]";
	}



}
