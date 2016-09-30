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
 * BASTBJ = Berita Acara Serah Terima Barang Jaminan
 * @author Administrator
 *
 */
@Entity
@Table(name = "mc_trn_bastbj")
public class TrnBastbj extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length = 20, name = "BASTBJ_NO")
	private String bastbjNo;
	
	@Column(length = 5, name = "OFFICE_CODE")
	private String officeCode;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "BASTBJ_DATE")
	private Date bastbjDate;
	
	@Column(length = 15, name = "BASTBJ_USERID")
	private String bastbjUserId;
	
	@Column(length = 2, name = "BASTBJ_STATUS")
	private String bastbjStatus;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	@Column(length = 30, name = "BASTBJ_ON_HAND")
	private String bastbjOnHand;

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

	
	public String getBastbjNo() {
		return bastbjNo;
	}

	public void setBastbjNo(String bastbjNo) {
		this.bastbjNo = bastbjNo;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Date getBastbjDate() {
		return bastbjDate;
	}

	public void setBastbjDate(Date bastbjDate) {
		this.bastbjDate = bastbjDate;
	}

	public String getBastbjUserId() {
		return bastbjUserId;
	}

	public void setBastbjUserId(String bastbjUserId) {
		this.bastbjUserId = bastbjUserId;
	}

	public String getBastbjStatus() {
		return bastbjStatus;
	}

	public void setBastbjStatus(String bastbjStatus) {
		this.bastbjStatus = bastbjStatus;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

	public String getBastbjOnHand() {
		return bastbjOnHand;
	}

	public void setBastbjOnHand(String bastbjOnHand) {
		this.bastbjOnHand = bastbjOnHand;
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
