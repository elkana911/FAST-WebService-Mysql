package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

@Entity
@Table(name = "mc_trn_rvcoll")
public class TrnRVColl extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TrnRVCollPK pk;
	
	@Column(length = 5, name = "OFFICE_CODE")
	private String officeCode;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "PROCESS_DATE")
	private Date processDate;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "TRANS_DATE")
	private Date transDate;

	@Column(length = 20, name = "COLL_ID")
	private String collId;
	
	@Column(length = 20, name = "CONTRACT_NO")
	private String contractNo;

	@Column(name = "INST_NO")
	private Long instNo;
	
	@Column(name = "RECEIVED_AMT")
	private BigDecimal receivedAmount;
	
	@Column(length = 2, name = "STATUS_FLAG")
	private String statusFlag;
	
	@Column(name = "PAYMENT_FLAG")
	private BigDecimal paymentFlag;

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

	@Column(length = 300, name = "NOTES")
	private String notes;

	@Column(length = 25, name = "LDV_NO")
	private String ldvNo;
	
	public TrnRVCollPK getPk() {
		return pk;
	}

	public void setPk(TrnRVCollPK pk) {
		this.pk = pk;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getCollId() {
		return collId;
	}

	public void setCollId(String collId) {
		this.collId = collId;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Long getInstNo() {
		return instNo;
	}

	public void setInstNo(Long instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getReceivedAmount() {
		return receivedAmount;
	}

	public void setReceivedAmount(BigDecimal receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}

	public BigDecimal getPaymentFlag() {
		return paymentFlag;
	}

	public void setPaymentFlag(BigDecimal paymentFlag) {
		this.paymentFlag = paymentFlag;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getLdvNo() {
		return ldvNo;
	}

	public void setLdvNo(String ldvNo) {
		this.ldvNo = ldvNo;
	}
	
}

