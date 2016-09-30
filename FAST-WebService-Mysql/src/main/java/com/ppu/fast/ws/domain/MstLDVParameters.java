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
@Table(name = "mc_mst_ldv_parameters")
public class MstLDVParameters extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 5, name = "LKP_FLAG")
	private String lkpFlag;
	
	@Column(length = 100, name = "DESCRIPTION")
	private String description;
	
	@Column(length = 2, name = "NEED_COMMENT")
	private String needComment;
	
	@Column(length = 2, name = "NEED_DATE")
	private String needDate;
	
	@Column(length = 2, name = "WORK_FLAG")
	private String workFlag;
	
	@Column(length = 2, name = "NEED_COLLECT")
	private String needCollect;
	
	@Column(length = 2, name = "IS_ACTIVE")
	private String isActive;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public String getLkpFlag() {
		return lkpFlag;
	}

	public void setLkpFlag(String lkpFlag) {
		this.lkpFlag = lkpFlag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNeedComment() {
		return needComment;
	}

	public void setNeedComment(String needComment) {
		this.needComment = needComment;
	}

	public String getNeedDate() {
		return needDate;
	}

	public void setNeedDate(String needDate) {
		this.needDate = needDate;
	}

	public String getWorkFlag() {
		return workFlag;
	}

	public void setWorkFlag(String workFlag) {
		this.workFlag = workFlag;
	}

	public String getNeedCollect() {
		return needCollect;
	}

	public void setNeedCollect(String needCollect) {
		this.needCollect = needCollect;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}
	
	
	
}
