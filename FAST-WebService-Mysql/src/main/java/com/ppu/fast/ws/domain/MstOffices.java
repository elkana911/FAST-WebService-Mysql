package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mc_mst_offices")
public class MstOffices implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length = 5, name = "OFFICE_CODE")
	private String officeCode;

	@Column(length = 3, name = "OFFICE_TYPE")
	private String officeType;

	@Column(length = 5, name = "REGIONAL_ID")
	private String regionalId;
	
	@Column(length = 50, name = "ADDRESS1")
	private String address1;
	
	@Column(length = 50, name = "ADDRESS2")
	private String address2;
	
	@Column(length = 50, name = "ADDRESS3")
	private String address3;
	
	@Column(length = 100, name = "CITY")
	private String city;
	
	@Column(length = 50, name = "PHONE1")
	private String phone1;

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getOfficeType() {
		return officeType;
	}

	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}

	public String getRegionalId() {
		return regionalId;
	}

	public void setRegionalId(String regionalId) {
		this.regionalId = regionalId;
	}

}
