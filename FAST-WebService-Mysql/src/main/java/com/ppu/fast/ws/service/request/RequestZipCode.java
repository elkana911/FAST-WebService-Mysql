package com.ppu.fast.ws.service.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestZip")
public class RequestZipCode extends BasicRequest{
	private List<String> zipCode;

	public List<String> getZipCode() {
		return zipCode;
	}

	public void setZipCode(List<String> zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "RequestZipCode [zipCode=" + zipCode + "]";
	}

}
