package com.ds.formObject;

public class DoctorForm {
	private String doctorName;
	private String specialist;
	private int age;
	private int experience;
	private String phoneNumber;
	private String address;
	public DoctorForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoctorForm(String doctorName, String specialist, int age, int experience, String phoneNumber,
			String address) {
		super();
		this.doctorName = doctorName;
		this.specialist = specialist;
		this.age = age;
		this.experience = experience;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public String getSpecialist() {
		return specialist;
	}
	public int getAge() {
		return age;
	}
	public int getExperience() {
		return experience;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "DoctorForm [doctorName=" + doctorName + ", specialist=" + specialist + ", age=" + age + ", experience="
				+ experience + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
}
