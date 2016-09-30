package com.ppu.fast.ws.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "RequestLKPByDate")
public class RequestLKPByDate extends BasicRequest{
	
	private String collectorCode;
	private String yyyyMMdd;

	public String getCollectorCode() {
		return collectorCode;
	}

	public void setCollectorCode(String collectorCode) {
		this.collectorCode = collectorCode;
	}
	
	public String getYyyyMMdd() {
		return yyyyMMdd;
	}

	public void setYyyyMMdd(String yyyyMMdd) {
		this.yyyyMMdd = yyyyMMdd;
	}

	@Override
	public String toString() {
		return "RequestLKPByDate [collectorCode=" + collectorCode + ", yyyyMMdd=" + yyyyMMdd + "]";
	}

}
