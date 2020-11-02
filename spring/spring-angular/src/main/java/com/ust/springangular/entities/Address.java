package com.ust.springangular.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	
	int houseNumber;
	String locality;
	String city;
	
	@ManyToOne
	Employee employee;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Address() {
		super();
	}


	public Address(int houseNumber, String locality, String city) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + "]";
	}
	
	

}
