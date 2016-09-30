package com.ppu.fast.ws.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Transient;

import com.ppu.fast.ws.domain.MstDelqReasons;
import com.ppu.fast.ws.domain.MstLDVClassifications;
import com.ppu.fast.ws.domain.MstLDVParameters;
import com.ppu.fast.ws.domain.MstLDVStatus;
import com.ppu.fast.ws.domain.MstOffices;

public class MasterData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<MstLDVStatus> ldpStatus;
	private List<MstLDVParameters> ldpParameters;
	private List<MstLDVClassifications> ldpClassifications;
	private List<MstDelqReasons> delqReasons;
	private List<MstOffices> offices;
	
	public List<MstLDVStatus> getLdpStatus() {
		return ldpStatus;
	}
	public void setLdpStatus(List<MstLDVStatus> ldpStatus) {
		this.ldpStatus = ldpStatus;
	}
	public List<MstLDVParameters> getLdpParameters() {
		return ldpParameters;
	}
	public void setLdpParameters(List<MstLDVParameters> ldpParameters) {
		this.ldpParameters = ldpParameters;
	}
	public List<MstLDVClassifications> getLdpClassifications() {
		return ldpClassifications;
	}
	public void setLdpClassifications(List<MstLDVClassifications> ldpClassifications) {
		this.ldpClassifications = ldpClassifications;
	}
	public List<MstDelqReasons> getDelqReasons() {
		return delqReasons;
	}
	public void setDelqReasons(List<MstDelqReasons> delqReasons) {
		this.delqReasons = delqReasons;
	}
	
	public List<MstOffices> getOffices() {
		return offices;
	}
	public void setOffices(List<MstOffices> offices) {
		this.offices = offices;
	}
	@Transient
	public int getTotalCount() {
		int sum = 0;
		
		if (ldpStatus != null)
			sum += ldpStatus.size();
		
		if (ldpParameters != null)
			sum += ldpParameters.size();
		
		if (ldpClassifications != null)
			sum += ldpClassifications.size();

		if (delqReasons != null)
			sum += delqReasons.size();
		
		if (offices != null)
			sum += offices.size();
		
		return sum;
	}

}
