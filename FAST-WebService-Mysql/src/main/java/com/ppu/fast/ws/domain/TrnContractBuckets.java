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
public class TrnContractBuckets extends BaseTable implements Serializable{

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
	
	@Column(length = 20, name = "SUPERVISOR_ID")
	private String supervisorId;

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

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "OVD_DUE_DATE")
	private Date ovdDueDate;
	
	@Column(name = "OVD_INST_NO")
	private Long ovdInstNo;
	
	@Column(name = "DPD")
	private Long dpd;

	@Column(length = 5, name = "CUST_NO")
	private String custNo;
	
	@Column(length = 5, name = "CUST_NAME")
	private String custName;
	
	@Column(name = "PRNC_AMT")
	private BigDecimal prncAmt;
	
	@Column(name = "PRNC_AMBC")
	private BigDecimal prncAMBC;
	
	@Column(name = "INTR_AMT")
	private BigDecimal intrAmt;
	
	@Column(name = "INTR_AMBC")
	private BigDecimal intrAMBC;

	@Column(length = 20, name = "RV_NO")
	private String rvNo;

	@Column(length = 2, name = "LKP_STATUS")
	private String lkpStatus;

	@Column(name = "PRNC_OTS")
	private BigDecimal prncOTS;

	@Column(name = "PRNC_AC")
	private BigDecimal prncAc;

	@Column(name = "INTR_AC")
	private BigDecimal intrAc;

	@Column(name = "PENALTY_AC")
	private Long penaltyAC;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public TrnContractBucketsPK getPk() {
		return pk;
	}

	public void setPk(TrnContractBucketsPK pk) {
		this.pk = pk;
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

	public BigDecimal getPrncAmt() {
		return prncAmt;
	}

	public void setPrncAmt(BigDecimal prncAmt) {
		this.prncAmt = prncAmt;
	}

	public BigDecimal getIntrAmt() {
		return intrAmt;
	}

	public void setIntrAmt(BigDecimal intrAmt) {
		this.intrAmt = intrAmt;
	}

	public BigDecimal getPrncAMBC() {
		return prncAMBC;
	}

	public void setPrncAMBC(BigDecimal prncAMBC) {
		this.prncAMBC = prncAMBC;
	}

	public BigDecimal getIntrAMBC() {
		return intrAMBC;
	}

	public void setIntrAMBC(BigDecimal intrAMBC) {
		this.intrAMBC = intrAMBC;
	}

	public String getRvNo() {
		return rvNo;
	}

	public void setRvNo(String rvNo) {
		this.rvNo = rvNo;
	}

	public String getLkpStatus() {
		return lkpStatus;
	}

	public void setLkpStatus(String lkpStatus) {
		this.lkpStatus = lkpStatus;
	}

	public BigDecimal getPrncOTS() {
		return prncOTS;
	}

	public void setPrncOTS(BigDecimal prncOTS) {
		this.prncOTS = prncOTS;
	}

	public BigDecimal getPrncAc() {
		return prncAc;
	}

	public void setPrncAc(BigDecimal prncAc) {
		this.prncAc = prncAc;
	}

	public BigDecimal getIntrAc() {
		return intrAc;
	}

	public void setIntrAc(BigDecimal intrAc) {
		this.intrAc = intrAc;
	}

	public Long getPenaltyAC() {
		return penaltyAC;
	}

	public void setPenaltyAC(Long penaltyAC) {
		this.penaltyAC = penaltyAC;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

	
	
}
