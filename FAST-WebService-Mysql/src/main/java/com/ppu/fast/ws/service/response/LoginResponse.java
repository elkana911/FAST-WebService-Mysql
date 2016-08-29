package com.ppu.fast.ws.service.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ppu.fast.ws.domain.MstSecUserVO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "hello")
@XmlType(name = "", propOrder = {"ip", "error", "data"})
public class LoginResponse {

	@XmlElement(name = "data", required = true)
	private MstSecUserVO data;

	@XmlElement(name = "error")
	private ErrorResponse error;

	@XmlElement(name = "ip")
	private String ip;

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

	public MstSecUserVO getData() {
		return data;
	}

	public void setData(MstSecUserVO data) {
		this.data = data;
	}
	
}