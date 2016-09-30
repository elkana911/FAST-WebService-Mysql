package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

@Entity
@Table(name = "mc_mst_ldv_status")
public class MstLDVStatus extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 10, name = "LKP_STATUS")
	private String lkpStatus;
	
	@Column(length = 50, name = "STATUS_DESC")
	private String statusDesc;
	
	@Column(name = "STATUS_LEVEL")
	private Long statusLevel;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public String getLkpStatus() {
		return lkpStatus;
	}

	public void setLkpStatus(String lkpStatus) {
		this.lkpStatus = lkpStatus;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public Long getStatusLevel() {
		return statusLevel;
	}

	public void setStatusLevel(Long statusLevel) {
		this.statusLevel = statusLevel;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}
	
}
