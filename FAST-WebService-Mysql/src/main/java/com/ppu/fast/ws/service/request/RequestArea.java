package com.ppu.fast.ws.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestArea")
public class RequestArea extends BasicRequest{
	
	private String kelurahan;
	private String zipCode;
	public String getKelurahan() {
		return kelurahan;
	}
	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "RequestArea [kelurahan=" + kelurahan + ", zipCode=" + zipCode + "]";
	}

}
