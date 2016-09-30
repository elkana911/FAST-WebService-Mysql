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

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "mc_trn_contract_buckets")
public class TrnContractBuckets2 extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	@Id
	@Column(length = 20, name = "PERIODE")
	private String periode;
	
	@Embedded
	private ContractId contract;
	*/
	@EmbeddedId
	private TrnContractBucketsPK pk;
	
	@Column(length = 5, name = "OFFICE_CODE")
	private String officeCode;
	
	@Column(length = 20, name = "SUPERVISOR_ID")
	private String supervisorId;
	
	@Column(length = 20, name = "DESKCALL_ID")
	private String deskcallId;
	
	@Column(length = 20, name = "COLLECTOR_ID")
	private String collectorId;
	
	@Column(length = 2, name = "CONTRACT_STATUS")
	private String contractStatus;
	
	@Column(name = "TOP")
	private Long top;
	
	@Column(name = "INST_NO")
	private Long instNo;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DUE_DATE")
	private Date dueDate;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(length = 50, name = "PAID_DATE")
	private Date paidDate;
	
	@Column(length = 2, name = "BEBAN_STATUS")
	private String bebanStatus;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "OVD_DUE_DATE")
	private Date ovdDueDate;
	
	@Column(name = "OVD_INST_NO")
	private Long ovdInstNo;
	
	@Column(name = "DPD")
	private Long dpd;
	
	@Column(length = 20, name = "COLLECTED_BY")
	private String collectedBy;
	
	@Column(length = 15, name = "TRAN_TYPE")
	private String tranType;
	
	@Column(length = 5, name = "CUST_NO")
	private String custNo;
	
	@Column(length = 5, name = "CUST_NAME")
	private String custName;
	
	@Column(name = "PRNC_AMT")
	private Long prncAmt;
	
	@Column(name = "INTR_AMT")
	private Long intrAmt;
	
	@Column(length = 20, name = "RV_NO")
	private String rvNo;
	
	@Column(length = 5, name = "CYCLE_AWAL")
	private String cycleAwal;
	
	@Column(length = 5, name = "CYCLE_AKHIR")
	private String cycleAkhir;
	
	@Column(length = 5, name = "PAYMENT_PATTERN")
	private String paymentPattern;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "ASSIGN_DATE_FIRST")
	private Date assignDateFirst;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "ASSIGN_DATE_LAST")
	private Date assignDateLast;
	
	@Column(name = "ASSIGNED")
	private Long assigned;
	
	@Column(name = "VISITED")
	private Long visited;
	
	@Column(length = 2, name = "LKP_STATUS")
	private String lkpStatus;
	
	@Column(length = 50, name = "LKP_LAST_VISIT")
	private String lkpLastVisit;
	
	@Column(length = 5, name = "LKP_LAST_FLAG")
	private String lkpLastFlag;
	
	@Column(name = "PRNC_OTS")
	private BigDecimal prncOTS;
	
	@Column(name = "PRNC_AMBC")
	private BigDecimal prncAMBC;
	
	@Column(name = "PRNC_AC")
	private BigDecimal prncAc;
	
	@Column(name = "INTR_OTS")
	private BigDecimal intrOTS;
	
	@Column(name = "INTR_AMBC")
	private BigDecimal intrAMBC;
	
	@Column(name = "INTR_AC")
	private BigDecimal intrAc;
	
	@Column(name = "INTR_AC_FIELD")
	private BigDecimal intrACField;
	
	@Column(length = 2, name = "COY_ID")
	private String coyID;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DATE_PU")
	private Date datePU;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DATE_AYD")
	private Date dateAYD;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LAST_PROMISE_DATE")
	private Date lastPromiseDate;
	
	@Column(length = 2, name = "FLAG_PENYELESAIAN")
	private String flagPenyelesaian;
	
	@Column(name = "PENALTY_AC")
	private Long penaltyAC;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "CONTRACT_DATE")
	private Date contractDate;
	
	@Column(length = 2, name = "PLATFORM")
	private String platform;
	
	@Column(length = 10, name = "BUSS_UNIT")
	private String bussUnit;
	
	@Column(length = 2, name = "GRADE")
	private String grade;
	
	@Column(length = 25, name = "LAST_LKP_NO")
	private String lastLKPNo;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LAST_LKP_DATE")
	private Date lastLKPDate;
	
	@Column(name = "PART")
	private Long part;
	
	@Column(name = "RISK_SCORING")
	private Long riskScoring;
	
	@Column(name = "PRNC_AC_INCENTIVE")
	private BigDecimal prncACIncentive;
	
	@Column(name = "INTR_AC_INCENTIVE")
	private BigDecimal intrACIncentive;
	
	@Column(length = 10, name = "ZIP_CODE")
	private String zipCode;
	
	@Column(length = 10, name = "SUB_ZIP_CODE")
	private String subZipCode;
	
	@Column(length = 50, name = "NEXT_VISIT")
	private String nextVisit;
	
	@Column(length = 5, name = "COLLECTOR_TYPE")
	private String collectorType;
	
	@Column(name = "LAST_POTENSI")
	private Long lastPotensi;
	
	@Column(length = 20, name = "LAST_COLLECTOR_ID")
	private String lastCollectorID;
	
	@Column(length = 20, name = "LAST_SUPERVISOR_ID")
	private String lastSupervisorID;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public TrnContractBucketsPK getPk() {
		return pk;
	}

	public void setPk(TrnContractBucketsPK pk) {
		this.pk = pk;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getCollectorId() {
		return collectorId;
	}

	public void setCollectorId(String collectorId) {
		this.collectorId = collectorId;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public Long getTop() {
		return top;
	}

	public void setTop(Long top) {
		this.top = top;
	}

	public Long getInstNo() {
		return instNo;
	}

	public void setInstNo(Long instNo) {
		this.instNo = instNo;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public String getBebanStatus() {
		return bebanStatus;
	}

	public void setBebanStatus(String bebanStatus) {
		this.bebanStatus = bebanStatus;
	}

	public Date getOvdDueDate() {
		return ovdDueDate;
	}

	public void setOvdDueDate(Date ovdDueDate) {
		this.ovdDueDate = ovdDueDate;
	}

	public Long getOvdInstNo() {
		return ovdInstNo;
	}

	public void setOvdInstNo(Long ovdInstNo) {
		this.ovdInstNo = ovdInstNo;
	}

	public Long getDpd() {
		return dpd;
	}

	public void setDpd(Long dpd) {
		this.dpd = dpd;
	}

	public String getCollectedBy() {
		return collectedBy;
	}

	public void setCollectedBy(String collectedBy) {
		this.collectedBy = collectedBy;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
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

	public Long getPrncAmt() {
		return prncAmt;
	}

	public void setPrncAmt(Long prncAmt) {
		this.prncAmt = prncAmt;
	}

	public Long getIntrAmt() {
		return intrAmt;
	}

	public void setIntrAmt(Long intrAmt) {
		this.intrAmt = intrAmt;
	}

	public String getRvNo() {
		return rvNo;
	}

	public void setRvNo(String rvNo) {
		this.rvNo = rvNo;
	}

	public String getCycleAwal() {
		return cycleAwal;
	}

	public void setCycleAwal(String cycleAwal) {
		this.cycleAwal = cycleAwal;
	}

	public String getCycleAkhir() {
		return cycleAkhir;
	}

	public void setCycleAkhir(String cycleAkhir) {
		this.cycleAkhir = cycleAkhir;
	}

	public String getPaymentPattern() {
		return paymentPattern;
	}

	public void setPaymentPattern(String paymentPattern) {
		this.paymentPattern = paymentPattern;
	}

	public Date getAssignDateFirst() {
		return assignDateFirst;
	}

	public void setAssignDateFirst(Date assignDateFirst) {
		this.assignDateFirst = assignDateFirst;
	}

	public Date getAssignDateLast() {
		return assignDateLast;
	}

	public void setAssignDateLast(Date assignDateLast) {
		this.assignDateLast = assignDateLast;
	}

	public Long getAssigned() {
		return assigned;
	}

	public void setAssigned(Long assigned) {
		this.assigned = assigned;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public String getLkpStatus() {
		return lkpStatus;
	}

	public void setLkpStatus(String lkpStatus) {
		this.lkpStatus = lkpStatus;
	}

	public String getLkpLastVisit() {
		return lkpLastVisit;
	}

	public void setLkpLastVisit(String lkpLastVisit) {
		this.lkpLastVisit = lkpLastVisit;
	}

	public String getLkpLastFlag() {
		return lkpLastFlag;
	}

	public void setLkpLastFlag(String lkpLastFlag) {
		this.lkpLastFlag = lkpLastFlag;
	}

	public BigDecimal getPrncOTS() {
		return prncOTS;
	}

	public void setPrncOTS(BigDecimal prncOTS) {
		this.prncOTS = prncOTS;
	}

	public BigDecimal getPrncAMBC() {
		return prncAMBC;
	}

	public void setPrncAMBC(BigDecimal prncAMBC) {
		this.prncAMBC = prncAMBC;
	}

	public BigDecimal getPrncAc() {
		return prncAc;
	}

	public void setPrncAc(BigDecimal prncAc) {
		this.prncAc = prncAc;
	}

	public BigDecimal getIntrOTS() {
		return intrOTS;
	}

	public void setIntrOTS(BigDecimal intrOTS) {
		this.intrOTS = intrOTS;
	}

	public BigDecimal getIntrAMBC() {
		return intrAMBC;
	}

	public void setIntrAMBC(BigDecimal intrAMBC) {
		this.intrAMBC = intrAMBC;
	}

	public BigDecimal getIntrAc() {
		return intrAc;
	}

	public void setIntrAc(BigDecimal intrAc) {
		this.intrAc = intrAc;
	}

	public BigDecimal getIntrACField() {
		return intrACField;
	}

	public void setIntrACField(BigDecimal intrACField) {
		this.intrACField = intrACField;
	}

	public String getCoyID() {
		return coyID;
	}

	public void setCoyID(String coyID) {
		this.coyID = coyID;
	}

	public Date getDatePU() {
		return datePU;
	}

	public void setDatePU(Date datePU) {
		this.datePU = datePU;
	}

	public Date getDateAYD() {
		return dateAYD;
	}

	public void setDateAYD(Date dateAYD) {
		this.dateAYD = dateAYD;
	}

	public Date getLastPromiseDate() {
		return lastPromiseDate;
	}

	public void setLastPromiseDate(Date lastPromiseDate) {
		this.lastPromiseDate = lastPromiseDate;
	}

	public String getFlagPenyelesaian() {
		return flagPenyelesaian;
	}

	public void setFlagPenyelesaian(String flagPenyelesaian) {
		this.flagPenyelesaian = flagPenyelesaian;
	}

	public Long getPenaltyAC() {
		return penaltyAC;
	}

	public void setPenaltyAC(Long penaltyAC) {
		this.penaltyAC = penaltyAC;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getBussUnit() {
		return bussUnit;
	}

	public void setBussUnit(String bussUnit) {
		this.bussUnit = bussUnit;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getLastLKPNo() {
		return lastLKPNo;
	}

	public void setLastLKPNo(String lastLKPNo) {
		this.lastLKPNo = lastLKPNo;
	}

	public Date getLastLKPDate() {
		return lastLKPDate;
	}

	public void setLastLKPDate(Date lastLKPDate) {
		this.lastLKPDate = lastLKPDate;
	}

	public Long getPart() {
		return part;
	}

	public void setPart(Long part) {
		this.part = part;
	}

	public Long getRiskScoring() {
		return riskScoring;
	}

	public void setRiskScoring(Long riskScoring) {
		this.riskScoring = riskScoring;
	}

	public BigDecimal getPrncACIncentive() {
		return prncACIncentive;
	}

	public void setPrncACIncentive(BigDecimal prncACIncentive) {
		this.prncACIncentive = prncACIncentive;
	}

	public BigDecimal getIntrACIncentive() {
		return intrACIncentive;
	}

	public void setIntrACIncentive(BigDecimal intrACIncentive) {
		this.intrACIncentive = intrACIncentive;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getSubZipCode() {
		return subZipCode;
	}

	public void setSubZipCode(String subZipCode) {
		this.subZipCode = subZipCode;
	}

	public String getNextVisit() {
		return nextVisit;
	}

	public void setNextVisit(String nextVisit) {
		this.nextVisit = nextVisit;
	}

	public String getCollectorType() {
		return collectorType;
	}

	public void setCollectorType(String collectorType) {
		this.collectorType = collectorType;
	}

	public Long getLastPotensi() {
		return lastPotensi;
	}

	public void setLastPotensi(Long lastPotensi) {
		this.lastPotensi = lastPotensi;
	}

	public String getLastCollectorID() {
		return lastCollectorID;
	}

	public void setLastCollectorID(String lastCollectorID) {
		this.lastCollectorID = lastCollectorID;
	}

	public String getLastSupervisorID() {
		return lastSupervisorID;
	}

	public void setLastSupervisorID(String lastSupervisorID) {
		this.lastSupervisorID = lastSupervisorID;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

	
}
