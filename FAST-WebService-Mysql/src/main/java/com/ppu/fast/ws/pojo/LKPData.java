package com.ppu.fast.ws.pojo;

import java.io.Serializable;
import java.util.List;

import com.ppu.fast.ws.domain.TrxCollectAddr;
import com.ppu.fast.ws.domain.TrxLDVDetails;
import com.ppu.fast.ws.domain.TrxLDVHeader;

public class LKPData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TrxLDVHeader header;
	private List<TrxLDVDetails> details;
	private List<TrxCollectAddr> address;
	
	public LKPData() {
	}

	public TrxLDVHeader getHeader() {
		return header;
	}

	public void setHeader(TrxLDVHeader header) {
		this.header = header;
	}

	public List<TrxLDVDetails> getDetails() {
		return details;
	}

	public void setDetails(List<TrxLDVDetails> details) {
		this.details = details;
	}

	public List<TrxCollectAddr> getAddress() {
		return address;
	}

	public void setAddress(List<TrxCollectAddr> address) {
		this.address = address;
	}
	
}
