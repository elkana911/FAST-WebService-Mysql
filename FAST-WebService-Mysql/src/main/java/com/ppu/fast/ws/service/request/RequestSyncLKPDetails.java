package com.ppu.fast.ws.service.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.ppu.fast.ws.domain.TrnLDVDetails;
import com.ppu.fast.ws.domain.TrnRVColl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "requestSyncLKPDetails")
public class RequestSyncLKPDetails extends BasicRequest{

	private List<TrnLDVDetails> ldvDetails;

	private List<TrnRVColl>	rvColl; 

	public List<TrnLDVDetails> getLdvDetails() {
		return ldvDetails;
	}

	public void setLdvDetails(List<TrnLDVDetails> ldvDetails) {
		this.ldvDetails = ldvDetails;
	}

	public List<TrnRVColl> getRvColl() {
		return rvColl;
	}

	public void setRvColl(List<TrnRVColl> rvColl) {
		this.rvColl = rvColl;
	}
	
}
