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
@Table(name = "mc_trn_ldv_hdrs")
public class TrnLDVHeader2 extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length = 25, name = "LDV_NO")
	private String ldvNo;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LDV_DATE")
	private Date ldvDate;
	
	@Column(length = 30, name = "OFFICE_CODE")
	private String officeCode;
	
	@Column(length = 20, name = "COLL_CODE")
	private String collCode;
	
	@Column(length = 20, name = "SPV_CODE")
	private String spvCode;
	
	@Column(length = 10, name = "TYPE")
	private String type;
	
	@Column(name = "UNIT_TOTAL")
	private BigDecimal unitTotal;

	@Column(name = "PRNC_AMBC")
	private BigDecimal prncAMBC;

	@Column(name = "PRNC_AC")
	private BigDecimal prncAC;

	@Column(name = "INTR_AMBC")
	private BigDecimal intrAMBC;

	@Column(name = "INTR_AC")
	private BigDecimal intrAC;

	@Column(name = "AMBC_TOTAL")
	private BigDecimal ambcTotal;

	@Column(name = "AC_TOTAL")
	private BigDecimal acTotal;

	@Column(name = "MAX_ENTRY_DAYS")
	private BigDecimal maxEntryDays;

	@Column(length = 30, name = "COY_CODE")
	private String coyCode;

	@Column(length = 5, name = "WORK_FLAG")
	private String workFlag;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "APPROVED_DATE")
	private Date approvedDate;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public String getLdvNo() {
		return ldvNo;
	}

	public void setLdvNo(String ldvNo) {
		this.ldvNo = ldvNo;
	}

	public Date getLdvDate() {
		return ldvDate;
	}

	public void setLdvDate(Date ldvDate) {
		this.ldvDate = ldvDate;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getCollCode() {
		return collCode;
	}

	public void setCollCode(String collCode) {
		this.collCode = collCode;
	}

	public String getSpvCode() {
		return spvCode;
	}

	public void setSpvCode(String spvCode) {
		this.spvCode = spvCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getUnitTotal() {
		return unitTotal;
	}

	public void setUnitTotal(BigDecimal unitTotal) {
		this.unitTotal = unitTotal;
	}

	public BigDecimal getPrncAMBC() {
		return prncAMBC;
	}

	public void setPrncAMBC(BigDecimal prncAMBC) {
		this.prncAMBC = prncAMBC;
	}

	public BigDecimal getPrncAC() {
		return prncAC;
	}

	public void setPrncAC(BigDecimal prncAC) {
		this.prncAC = prncAC;
	}

	public BigDecimal getIntrAMBC() {
		return intrAMBC;
	}

	public void setIntrAMBC(BigDecimal intrAMBC) {
		this.intrAMBC = intrAMBC;
	}

	public BigDecimal getIntrAC() {
		return intrAC;
	}

	public void setIntrAC(BigDecimal intrAC) {
		this.intrAC = intrAC;
	}

	public BigDecimal getAmbcTotal() {
		return ambcTotal;
	}

	public void setAmbcTotal(BigDecimal ambcTotal) {
		this.ambcTotal = ambcTotal;
	}

	public BigDecimal getAcTotal() {
		return acTotal;
	}

	public void setAcTotal(BigDecimal acTotal) {
		this.acTotal = acTotal;
	}

	public BigDecimal getMaxEntryDays() {
		return maxEntryDays;
	}

	public void setMaxEntryDays(BigDecimal maxEntryDays) {
		this.maxEntryDays = maxEntryDays;
	}

	public String getCoyCode() {
		return coyCode;
	}

	public void setCoyCode(String coyCode) {
		this.coyCode = coyCode;
	}

	public String getWorkFlag() {
		return workFlag;
	}

	public void setWorkFlag(String workFlag) {
		this.workFlag = workFlag;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}


}
