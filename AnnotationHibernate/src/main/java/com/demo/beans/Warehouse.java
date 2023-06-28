package com.demo.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Warehouse {
	private int wid;
	private String wname;
	public Warehouse() {
		super();
	}
	public Warehouse(int wid, String wname) {
		super();
		this.wid = wid;
		this.wname = wname;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	@Override
	public String toString() {
		return "Warehouse [wid=" + wid + ", wname=" + wname + "]";
	}
	
}
