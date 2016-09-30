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
@Table(name = "fs_mst_kelurahan")
public class MstKelurahan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 10, name = "KEL_CODE")
	private String kelCode;
	
	@Column(length = 100, name = "KELURAHAN")
	private String kelurahan;
	
	@Column(length = 10, name = "KEC_CODE")
	private String kecCode;
	
	@Column(length = 12, name = "CREATE_BY")
	private String createBy;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(length = 10, name = "UPDATE_DATE")
	private Date updateDate;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;
	
	@Column(length = 10, name = "UPDATE_BY")
	private String updateBy;

	public String getKelCode() {
		return kelCode;
	}

	public void setKelCode(String kelCode) {
		this.kelCode = kelCode;
	}

	public String getKelurahan() {
		return kelurahan;
	}

	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}

	public String getKecCode() {
		return kecCode;
	}

	public void setKecCode(String kecCode) {
		this.kecCode = kecCode;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	
}
