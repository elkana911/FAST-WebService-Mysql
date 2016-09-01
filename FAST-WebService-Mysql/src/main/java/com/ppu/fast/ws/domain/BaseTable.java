package com.ppu.fast.ws.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

@MappedSuperclass
public abstract class BaseTable {
	@Column(length = 15, name = "CREATED_BY")
	private String createdBy;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "CREATED_TIMESTAMP")
	private Date createdTimestamp;

	@Column(length = 15, name = "LASTUPDATE_BY")
	private String lastupdateBy;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LASTUPDATE_TIMESTAMP")
	private Date lastupdateTimestamp;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public String getLastupdateBy() {
		return lastupdateBy;
	}

	public void setLastupdateBy(String lastupdateBy) {
		this.lastupdateBy = lastupdateBy;
	}

	public Date getLastupdateTimestamp() {
		return lastupdateTimestamp;
	}

	public void setLastupdateTimestamp(Date lastupdateTimestamp) {
		this.lastupdateTimestamp = lastupdateTimestamp;
	}
	
}
