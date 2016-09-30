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
@Table(name = "mc_trn_ldv_dtls")
public class TrnLDVDetails extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TrnLDVDetailsPK pk;

	@Column(length = 25, name = "PERIOD")
	private String period;
	
	@Column(length = 30, name = "CONTRACT_NO")
	private String contractNo;
	
	@Column(length = 20, name = "CUST_NO")
	private String custNo;
	
	@Column(length = 60, name = "CUST_NAME")
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

	@Column(length = 5, name = "WORK_STATUS")
	private String workStatus;

	@Column(name = "PRNC_OTS")
	private BigDecimal principalOutstanding;
	
	@Column(length = 50, name = "OCCUPATION")
	private String occupation;
	
	@Column(length = 50, name = "SUB_OCCUPATION")
	private String subOccupation;
	
	@Column(length = 20, name = "PAL_NO")
	private String palNo;
	
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

	@Column(name = "MONTH_INST")
	private BigDecimal monthInst;

	@Column(name = "DAYS_INTR_AMBC")
	private BigDecimal daysIntrAmbc;
	
	@Column(name = "COLLECTION_FEE")
	private BigDecimal collectionFee;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LAST_PAID_DATE")
	private Date lastPaidDate;
	
	@Column(name = "DPD")
	private Long dpd;
	
	
	public TrnLDVDetailsPK getPk() {
		return pk;
	}

	public void setPk(TrnLDVDetailsPK pk) {
		this.pk = pk;
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

	public String getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
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

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPalNo() {
		return palNo;
	}

	public void setPalNo(String palNo) {
		this.palNo = palNo;
	}

	public String getSubOccupation() {
		return subOccupation;
	}

	public void setSubOccupation(String subOccupation) {
		this.subOccupation = subOccupation;
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

	public BigDecimal getMonthInst() {
		return monthInst;
	}

	public void setMonthInst(BigDecimal monthInst) {
		this.monthInst = monthInst;
	}

	public BigDecimal getDaysIntrAmbc() {
		return daysIntrAmbc;
	}

	public void setDaysIntrAmbc(BigDecimal daysIntrAmbc) {
		this.daysIntrAmbc = daysIntrAmbc;
	}

	public BigDecimal getCollectionFee() {
		return collectionFee;
	}

	public void setCollectionFee(BigDecimal collectionFee) {
		this.collectionFee = collectionFee;
	}

	public Date getLastPaidDate() {
		return lastPaidDate;
	}

	public void setLastPaidDate(Date lastPaidDate) {
		this.lastPaidDate = lastPaidDate;
	}

	public Long getDpd() {
		return dpd;
	}

	public void setDpd(Long dpd) {
		this.dpd = dpd;
	}

	
}
