package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TrnRVCollPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4310354671345269453L;

	@Column(length = 30, name = "RVCOLL_NO")
	private String rvCollNo;
	
	@Column(length = 16, name = "RVB_NO")
	private String rbvNo;

	public String getRvCollNo() {
		return rvCollNo;
	}

	public void setRvCollNo(String rvCollNo) {
		this.rvCollNo = rvCollNo;
	}

	public String getRbvNo() {
		return rbvNo;
	}

	public void setRbvNo(String rbvNo) {
		this.rbvNo = rbvNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rbvNo == null) ? 0 : rbvNo.hashCode());
		result = prime * result + ((rvCollNo == null) ? 0 : rvCollNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrnRVCollPK other = (TrnRVCollPK) obj;
		if (rbvNo == null) {
			if (other.rbvNo != null)
				return false;
		} else if (!rbvNo.equals(other.rbvNo))
			return false;
		if (rvCollNo == null) {
			if (other.rvCollNo != null)
				return false;
		} else if (!rvCollNo.equals(other.rvCollNo))
			return false;
		return true;
	}
	
	
}
