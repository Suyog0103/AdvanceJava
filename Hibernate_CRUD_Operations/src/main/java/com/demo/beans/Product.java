package com.demo.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductCRUD")
public class Product {
@Id
	private int pid;
	private String pname;
@Embedded
	private WareHouse w;
	public Product() {
		super();
	}
	public Product(int pid, String pname, WareHouse w) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.w = w;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public WareHouse getW() {
		return w;
	}
	public void setW(WareHouse w) {
		this.w = w;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", w=" + w + "]";
	}
	
	
}
