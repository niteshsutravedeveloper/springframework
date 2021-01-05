package com.nt.dto;

public class ProductDto {
	private int pid;
	private String pname;
	private Double price;
	private String description;
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public Double getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", price=" + price + ", description=" + description
				+ "]";
	}
	
}
