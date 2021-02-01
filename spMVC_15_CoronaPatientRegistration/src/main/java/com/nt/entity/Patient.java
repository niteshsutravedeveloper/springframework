package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "corona_patient_list")
public class Patient implements Serializable {
	@Id
	private Integer pid;
	@Column(name = "patient_name")
	private String pname;
	@Column(name = "phonenumber")
	private String phoneNumber;

	private Integer age;
	private String gender;
	@Column(name = "patient_address")
	private String address;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Integer pid, String pname, String phoneNumber, Integer age, String gender, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", phoneNumber=" + phoneNumber + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + "]";
	}

}
