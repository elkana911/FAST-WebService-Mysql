package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TrnLDVCommentsPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8644029550467661526L;

	/**
	 * 
	 */
	
	@Column(length = 25, name = "LDV_NO")
	private String ldvNo;
	
	@Column(name = "SEQ_NO")
	private Long seqNo;

	public String getLdvNo() {
		return ldvNo;
	}

	public void setLdvNo(String ldvNo) {
		this.ldvNo = ldvNo;
	}

	public Long getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ldvNo == null) ? 0 : ldvNo.hashCode());
		result = prime * result + ((seqNo == null) ? 0 : seqNo.hashCode());
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
		TrnLDVCommentsPK other = (TrnLDVCommentsPK) obj;
		if (ldvNo == null) {
			if (other.ldvNo != null)
				return false;
		} else if (!ldvNo.equals(other.ldvNo))
			return false;
		if (seqNo == null) {
			if (other.seqNo != null)
				return false;
		} else if (!seqNo.equals(other.seqNo))
			return false;
		return true;
	}
	
	

}
