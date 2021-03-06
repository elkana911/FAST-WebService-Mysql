package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

@Entity
@Table(name = "mc_hist_installments")
public class HistInstallments extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private HistInstallmentsPK pk; 

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DUE_DATE")
	private Date dueDate;
	
	@Column(name = "PENALTY_AMT")
	private Long penaltyAmt;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "PAID_DATE")
	private Date paidDate;
	
	@Column(name = "PRNC_AMT_DTL_CUST")
	private Long prncAmtDtlCust;
	
	@Column(name = "INTR_AMT_DTL_AR")
	private Long intrAmtDtlAr;
	
	@Column(name = "COLL_FEE")
	private Long collFee;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public HistInstallmentsPK getPk() {
		return pk;
	}

	public void setPk(HistInstallmentsPK pk) {
		this.pk = pk;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Long getPenaltyAmt() {
		return penaltyAmt;
	}

	public void setPenaltyAmt(Long penaltyAmt) {
		this.penaltyAmt = penaltyAmt;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public Long getPrncAmtDtlCust() {
		return prncAmtDtlCust;
	}

	public void setPrncAmtDtlCust(Long prncAmtDtlCust) {
		this.prncAmtDtlCust = prncAmtDtlCust;
	}

	public Long getIntrAmtDtlAr() {
		return intrAmtDtlAr;
	}

	public void setIntrAmtDtlAr(Long intrAmtDtlAr) {
		this.intrAmtDtlAr = intrAmtDtlAr;
	}

	public Long getCollFee() {
		return collFee;
	}

	public void setCollFee(Long collFee) {
		this.collFee = collFee;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

	
}
