package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddressHibernate")
public class StudentAddress {
@Id
	private int aid;
	private String Street;
	private String city;
	
	public StudentAddress() {
		super();
	}
	
	public StudentAddress(int aid, String street, String city) {
		super();
		this.aid = aid;
		Street = street;
		this.city = city;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentAddress [aid=" + aid + ", Street=" + Street + ", city=" + city + "]";
	}
	
	
	

}
