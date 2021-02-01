package com.nt.dto;



public class PatientDto  {
	private Integer pid;
	
	private String pname;
	
	private String phoneNumber;

	private Integer age;
	private String gender;
	
	private String address;

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

	public void setAddress(String address) {
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public PatientDto(Integer pid, String pname, String phoneNumber, Integer age, String gender, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PatientDto [pid=" + pid + ", pname=" + pname + ", phoneNumber=" + phoneNumber + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + "]";
	}
	
	

}
