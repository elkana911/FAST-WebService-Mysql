package com.ppu.fast.ws.service.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ppu.fast.ws.domain.TrnChangeAddr;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestSyncChangeAddr")
public class RequestSyncChangeAddr extends BasicRequest{

	private List<TrnChangeAddr> data;

	public List<TrnChangeAddr> getData() {
		return data;
	}

	public void setData(List<TrnChangeAddr> data) {
		this.data = data;
	}
	
}
