package com.ppu.fast.ws.service.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.ppu.fast.ws.pojo.MasterData;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GetMasterData")
@XmlType(name = "", propOrder = {"ip", "error", "data"})
public class ResponseGetMasterData {

	@XmlElement(name = "data", required = true)
	private MasterData data;

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

	public MasterData getData() {
		return data;
	}

	public void setData(MasterData data) {
		this.data = data;
	}
	
}
