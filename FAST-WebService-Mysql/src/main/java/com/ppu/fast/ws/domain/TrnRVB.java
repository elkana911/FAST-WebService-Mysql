package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

/**
 * RVB = Receive Voucher Blank (voucher/kuitansi kosong)
 * sedikit rowsnya
 * @author Administrator
 *
 */
@Entity
@Table(name = "mc_trn_rvb")
public class TrnRVB extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length = 16, name = "RVB_NO")
	private String rvbNo;
	
	@Column(length = 16, name = "OFFICE_CODE")
	private String officeCode;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "RVB_DATE")
	private Date rvbDate;
	
	@Column(length = 16, name = "RVB_ON_HAND")
	private String rvbOnHand;
	
	@Column(length = 16, name = "RV_NO")
	private String rvNo;
	
	@Column(length = 16, name = "REMARKS")
	private String remarks;
	
	@Column(length = 16, name = "RVB_STATUS")
	private String rvbStatus;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

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

	public String getRvbNo() {
		return rvbNo;
	}

	public void setRvbNo(String rvbNo) {
		this.rvbNo = rvbNo;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Date getRvbDate() {
		return rvbDate;
	}

	public void setRvbDate(Date rvbDate) {
		this.rvbDate = rvbDate;
	}

	public String getRvbOnHand() {
		return rvbOnHand;
	}

	public void setRvbOnHand(String rvbOnHand) {
		this.rvbOnHand = rvbOnHand;
	}

	public String getRvNo() {
		return rvNo;
	}

	public void setRvNo(String rvNo) {
		this.rvNo = rvNo;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRvbStatus() {
		return rvbStatus;
	}

	public void setRvbStatus(String rvbStatus) {
		this.rvbStatus = rvbStatus;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
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
