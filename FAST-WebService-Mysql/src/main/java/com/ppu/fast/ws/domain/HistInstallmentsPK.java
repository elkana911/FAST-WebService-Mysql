package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HistInstallmentsPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 11877847120956799L;

	@Column(length = 20, name = "CONTRACT_NO")
	private String contractNo;
	
	@Column(name = "INST_NO")
	private Long instNo;

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Long getInstNo() {
		return instNo;
	}

	public void setInstNo(Long instNo) {
		this.instNo = instNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractNo == null) ? 0 : contractNo.hashCode());
		result = prime * result + ((instNo == null) ? 0 : instNo.hashCode());
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
		HistInstallmentsPK other = (HistInstallmentsPK) obj;
		if (contractNo == null) {
			if (other.contractNo != null)
				return false;
		} else if (!contractNo.equals(other.contractNo))
			return false;
		if (instNo == null) {
			if (other.instNo != null)
				return false;
		} else if (!instNo.equals(other.instNo))
			return false;
		return true;
	}


	
}
