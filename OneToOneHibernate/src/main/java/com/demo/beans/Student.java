package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentHibernate")
public class Student {
@Id
	private int sid;
	private String sname;
@OneToOne
@JoinColumn(name="addid")
	private StudentAddress sd;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, StudentAddress sd) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sd = sd;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public StudentAddress getSd() {
		return sd;
	}

	public void setSd(StudentAddress sd) {
		this.sd = sd;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sd=" + sd + "]";
	}
	
	
	

}
