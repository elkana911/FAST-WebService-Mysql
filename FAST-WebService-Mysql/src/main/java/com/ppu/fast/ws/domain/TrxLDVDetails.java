package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

@Entity
@Table(name = "mc_trn_ldv_dtls")
public class TrxLDVDetails extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(length = 25, name = "LDV_NO")
	private String ldvNo;
	
	@Id
	@Column(name = "SEQ_NO")
	private Long seqNo;

	@Column(length = 25, name = "PERIOD")
	private String period;
	
	@Column(length = 25, name = "CONTRACT_NO")
	private String contractNo;
	
	@Column(length = 25, name = "CUST_NO")
	private String custNo;
	
	@Column(length = 25, name = "CUST_NAME")
	private String custName;
	
	@Column(name = "OVD_INST_NO")
	private Long ovdInstNo;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "OVD_DUE_DATE")
	private Date ovdDueDate;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DUE_DATE")
	private Date dueDate;
	
	@Column(name = "INST_NO")
	private BigDecimal instNo;

	@Column(name = "PRNC_AMT")
	private BigDecimal principalAmount;

	@Column(name = "INTR_AMT")
	private BigDecimal interestAmount;

	@Column(name = "PRNC_AMBC")
	private BigDecimal principalAMBC;
	
	@Column(name = "INTR_AMBC")
	private BigDecimal interestAMBC;//AmountMustBeCollected

	@Column(name = "PENALTY_AMBC")
	private BigDecimal penaltyAMBC;
	
	@Column(name = "PRNC_AC")
	private BigDecimal principalAmountCollected;

	@Column(name = "INTR_AC")
	private BigDecimal interestAmountCollected;
	
	@Column(name = "PENALTY_AC")
	private BigDecimal penaltyAmountCollected;
	
	@Column(length = 10, name = "LDV_FLAG")
	private String ldvFlag;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "PROMISE_DATE")
	private Date promiseDate;

	@Column(length = 5, name = "WORK_STATUS")
	private String workStatus;

	@Column(name = "VISIT_SEQ")
	private BigDecimal visitSeq;

	@Column(name = "PRNC_OTS")
	private BigDecimal principalOutstanding;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

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

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
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

	public Long getOvdInstNo() {
		return ovdInstNo;
	}

	public void setOvdInstNo(Long ovdInstNo) {
		this.ovdInstNo = ovdInstNo;
	}

	public Date getOvdDueDate() {
		return ovdDueDate;
	}

	public void setOvdDueDate(Date ovdDueDate) {
		this.ovdDueDate = ovdDueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public BigDecimal getInstNo() {
		return instNo;
	}

	public void setInstNo(BigDecimal instNo) {
		this.instNo = instNo;
	}

	public BigDecimal getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(BigDecimal principalAmount) {
		this.principalAmount = principalAmount;
	}

	public BigDecimal getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(BigDecimal interestAmount) {
		this.interestAmount = interestAmount;
	}

	public BigDecimal getPrincipalAMBC() {
		return principalAMBC;
	}

	public void setPrincipalAMBC(BigDecimal principalAMBC) {
		this.principalAMBC = principalAMBC;
	}

	public BigDecimal getInterestAMBC() {
		return interestAMBC;
	}

	public void setInterestAMBC(BigDecimal interestAMBC) {
		this.interestAMBC = interestAMBC;
	}

	public BigDecimal getPenaltyAMBC() {
		return penaltyAMBC;
	}

	public void setPenaltyAMBC(BigDecimal penaltyAMBC) {
		this.penaltyAMBC = penaltyAMBC;
	}

	public BigDecimal getPrincipalAmountCollected() {
		return principalAmountCollected;
	}

	public void setPrincipalAmountCollected(BigDecimal principalAmountCollected) {
		this.principalAmountCollected = principalAmountCollected;
	}

	public BigDecimal getInterestAmountCollected() {
		return interestAmountCollected;
	}

	public void setInterestAmountCollected(BigDecimal interestAmountCollected) {
		this.interestAmountCollected = interestAmountCollected;
	}

	public BigDecimal getPenaltyAmountCollected() {
		return penaltyAmountCollected;
	}

	public void setPenaltyAmountCollected(BigDecimal penaltyAmountCollected) {
		this.penaltyAmountCollected = penaltyAmountCollected;
	}

	public String getLdvFlag() {
		return ldvFlag;
	}

	public void setLdvFlag(String ldvFlag) {
		this.ldvFlag = ldvFlag;
	}

	public Date getPromiseDate() {
		return promiseDate;
	}

	public void setPromiseDate(Date promiseDate) {
		this.promiseDate = promiseDate;
	}

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}

	public BigDecimal getVisitSeq() {
		return visitSeq;
	}

	public void setVisitSeq(BigDecimal visitSeq) {
		this.visitSeq = visitSeq;
	}

	public BigDecimal getPrincipalOutstanding() {
		return principalOutstanding;
	}

	public void setPrincipalOutstanding(BigDecimal principalOutstanding) {
		this.principalOutstanding = principalOutstanding;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}
	
	

}
