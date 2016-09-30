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
@Table(name = "mc_trn_ldv_comments")
public class TrnLDVComments extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TrnLDVCommentsPK pk;

	@Column(length = 30, name = "CONTRACT_NO")
	private String contractNo;
	
	@Column(length = 5, name = "DELQ_CODE")
	private String delqCode;
	
	@Column(length = 5, name = "CLASS_CODE")
	private String classCode;
	
	@Column(name = "POTENSI")
	private Long potensi;
	
	@Column(length = 10, name = "OCPT_CODE")
	private String ocptCode;

	@Column(length = 10, name = "OCPT_CODE_SUB")
	private String ocptCodeSub;

	@Column(length = 100, name = "WHO_MET")
	private String whoMet;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "PROMISE_DATE")
	private Date promiseDate;

	@Column(length = 500, name = "ACTION_PLAN")
	private String actionPlan;

	@Column(name = "PLAN_PAY_AMT")
	private BigDecimal planPayAmount;
	
	@Column(length = 2000, name = "LKP_COMMENTS")
	private String lkpComments;
	
	@Column(length = 35, name = "LONGITUDE")
	private String longitude;
	
	@Column(length = 35, name = "LATITUDE")
	private String latitude;
	
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

	public TrnLDVCommentsPK getPk() {
		return pk;
	}

	public void setPk(TrnLDVCommentsPK pk) {
		this.pk = pk;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getDelqCode() {
		return delqCode;
	}

	public void setDelqCode(String delqCode) {
		this.delqCode = delqCode;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public Long getPotensi() {
		return potensi;
	}

	public void setPotensi(Long potensi) {
		this.potensi = potensi;
	}

	public String getOcptCode() {
		return ocptCode;
	}

	public void setOcptCode(String ocptCode) {
		this.ocptCode = ocptCode;
	}

	public String getOcptCodeSub() {
		return ocptCodeSub;
	}

	public void setOcptCodeSub(String ocptCodeSub) {
		this.ocptCodeSub = ocptCodeSub;
	}

	public String getWhoMet() {
		return whoMet;
	}

	public void setWhoMet(String whoMet) {
		this.whoMet = whoMet;
	}

	public Date getPromiseDate() {
		return promiseDate;
	}

	public void setPromiseDate(Date promiseDate) {
		this.promiseDate = promiseDate;
	}

	public String getActionPlan() {
		return actionPlan;
	}

	public void setActionPlan(String actionPlan) {
		this.actionPlan = actionPlan;
	}

	public BigDecimal getPlanPayAmount() {
		return planPayAmount;
	}

	public void setPlanPayAmount(BigDecimal planPayAmount) {
		this.planPayAmount = planPayAmount;
	}

	public String getLkpComments() {
		return lkpComments;
	}

	public void setLkpComments(String lkpComments) {
		this.lkpComments = lkpComments;
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
