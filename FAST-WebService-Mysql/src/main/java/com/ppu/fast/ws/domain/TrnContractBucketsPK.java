package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TrnContractBucketsPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5414299755588705104L;
	
	@Column(length = 6, name = "PERIOD")
	private String period;

	@Column(length = 20, name = "CONTRACT_NO")
	private String contractNo;

	@Column(length = 5, name = "OFFICE_CODE")
	private String officeCode;

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contractNo == null) ? 0 : contractNo.hashCode());
		result = prime * result + ((officeCode == null) ? 0 : officeCode.hashCode());
		result = prime * result + ((period == null) ? 0 : period.hashCode());
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
		TrnContractBucketsPK other = (TrnContractBucketsPK) obj;
		if (contractNo == null) {
			if (other.contractNo != null)
				return false;
		} else if (!contractNo.equals(other.contractNo))
			return false;
		if (officeCode == null) {
			if (other.officeCode != null)
				return false;
		} else if (!officeCode.equals(other.officeCode))
			return false;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		return true;
	}
	
}
