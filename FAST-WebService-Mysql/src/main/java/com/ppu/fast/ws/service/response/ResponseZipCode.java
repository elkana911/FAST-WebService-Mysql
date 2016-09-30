package com.ppu.fast.ws.service.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ppu.fast.ws.domain.MstZip;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "zip")
@XmlType(name = "", propOrder = {"ip", "error", "data"})
public class ResponseZipCode {
	
	@XmlElement(name = "data", required = true)
	private List<MstZip> data;

	@XmlElement(name = "error")
	private ErrorResponse error;

	@XmlElement(name = "ip")
	private String ip;

	public List<MstZip> getData() {
		return data;
	}

	public void setData(List<MstZip> data) {
		this.data = data;
	}

	public ErrorResponse getError() {
		
		return error;
	}

	public void setError(ErrorResponse error) {
		this.error = error;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
