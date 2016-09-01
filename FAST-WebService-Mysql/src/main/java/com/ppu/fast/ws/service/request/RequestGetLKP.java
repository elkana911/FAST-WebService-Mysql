package com.ppu.fast.ws.service.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestGetLKP")
public class RequestGetLKP extends BasicRequest{
	
	private String collectorCode;

	public String getCollectorCode() {
		return collectorCode;
	}

	public void setCollectorCode(String collectorCode) {
		this.collectorCode = collectorCode;
	}

	@Override
	public String toString() {
		return "RequestGetLKP [collectorCode=" + collectorCode + "]";
	}

}
