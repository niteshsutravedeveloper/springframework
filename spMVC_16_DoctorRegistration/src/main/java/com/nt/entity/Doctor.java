package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor_details")
public class Doctor {
	@Id
	@Column(name = "doctor_id")
	private Integer doctorId;
	@Column(name = "doctor_name")
	private String doctorName;
	@Column
	private Integer age;
	@Column
	private String specialists;
	@Column
	private String address;
	@Column
	private Integer experience;
	@Column(name = "phone_number")
	private String phoneNumber;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Integer doctorId, String doctorName, Integer age, String specialists, String address,
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
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", age=" + age + ", specialists="
				+ specialists + ", address=" + address + ", experience=" + experience + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}
