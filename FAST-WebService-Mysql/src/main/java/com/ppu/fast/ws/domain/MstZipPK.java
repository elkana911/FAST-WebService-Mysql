package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MstZipPK implements Serializable{

	@Column(length = 10, name = "ZIP_CODE")
	private String zipCode;
	
	@Column(length = 5, name = "SUB_ZIP_CODE")
	private String subZipCode;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getSubZipCode() {
		return subZipCode;
	}

	public void setSubZipCode(String subZipCode) {
		this.subZipCode = subZipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subZipCode == null) ? 0 : subZipCode.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		MstZipPK other = (MstZipPK) obj;
		if (subZipCode == null) {
			if (other.subZipCode != null)
				return false;
		} else if (!subZipCode.equals(other.subZipCode))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
	
	
}
