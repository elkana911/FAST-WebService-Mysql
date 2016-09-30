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
@Table(name = "mc_trn_repo")
public class TrnRepo extends BaseTable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 20, name = "REPO_NO")
	private String repoNo;
	
	@Column(length = 20, name = "CONTRACT_NO")
	private String contractNo;
	
	@Column(length = 20, name = "CUST_NO", nullable = false)
	private String custNo;
	
	@Column(length = 60, name = "CUST_NAME")
	private String custName;
	
	@Column(length = 5, name = "BASTBJ_FLAG")
	private String bastbjFlag;

	@Column(length = 20, name = "PAL_NO")
	private String palNo;
	
	@Column(length = 2, name = "STNK_STATUS")
	private String stnkStatus;

	@Column(length = 20, name = "BASTBJ_NO")
	private String bastbjNo;

	@Column(length = 200, name = "REPO_COMMENTS")
	private String repoComments;

	@Column(length = 35, name = "LONGITUDE")
	private String longitude;

	@Column(length = 35, name = "LATITUDE")
	private String latitude;

	@Column(length = 1, name = "FLAG_TO_EMRAFIN")
	private String flagToEmrafin;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DATE_TO_EMRAFIN")
	private Date dateToEmrafin;

	@Column(length = 1, name = "FLAG_DONE")
	private String flagDone;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DATE_DONE")
	private Date dateDone;

	public String getRepoNo() {
		return repoNo;
	}

	public void setRepoNo(String repoNo) {
		this.repoNo = repoNo;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getBastbjFlag() {
		return bastbjFlag;
	}

	public void setBastbjFlag(String bastbjFlag) {
		this.bastbjFlag = bastbjFlag;
	}

	public String getPalNo() {
		return palNo;
	}

	public void setPalNo(String palNo) {
		this.palNo = palNo;
	}

	public String getStnkStatus() {
		return stnkStatus;
	}

	public void setStnkStatus(String stnkStatus) {
		this.stnkStatus = stnkStatus;
	}

	public String getBastbjNo() {
		return bastbjNo;
	}

	public void setBastbjNo(String bastbjNo) {
		this.bastbjNo = bastbjNo;
	}

	public String getRepoComments() {
		return repoComments;
	}

	public void setRepoComments(String repoComments) {
		this.repoComments = repoComments;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getFlagToEmrafin() {
		return flagToEmrafin;
	}

	public void setFlagToEmrafin(String flagToEmrafin) {
		this.flagToEmrafin = flagToEmrafin;
	}

	public Date getDateToEmrafin() {
		return dateToEmrafin;
	}

	public void setDateToEmrafin(Date dateToEmrafin) {
		this.dateToEmrafin = dateToEmrafin;
	}

	public String getFlagDone() {
		return flagDone;
	}

	public void setFlagDone(String flagDone) {
		this.flagDone = flagDone;
	}

	public Date getDateDone() {
		return dateDone;
	}

	public void setDateDone(Date dateDone) {
		this.dateDone = dateDone;
	}

	
}
