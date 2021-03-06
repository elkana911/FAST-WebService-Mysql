package com.ppu.fast.ws.service.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "hello")
@XmlType(name = "", propOrder = {"ip", "error", "data"})
public class StringResponse {

	@XmlElement(name = "data", required = true)
	private String data;

	@XmlElement(name = "error", required = true)
	private ErrorResponse error;

	@XmlElement(name = "ip", required = true)
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
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "SendPositionResponse [data=" + data + ", error=" + error + ", ip=" + ip + "]";
	}
	
}
