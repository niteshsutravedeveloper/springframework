package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	@Id
	private Integer pid;
	@Column
	private String pname;
	@Column
	private Double price;
	@Column
	private String description;
	public void setPid(Integer pid) {
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
	public Integer getPid() {
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
	public Product(Integer pid, String pname, Double price, String description) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.description = description;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", description=" + description + "]";
	}
	
	

}
