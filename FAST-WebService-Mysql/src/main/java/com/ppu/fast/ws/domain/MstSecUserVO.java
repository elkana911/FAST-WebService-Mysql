package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

@Entity
@Table(name = "mb_sec_users")
public class MstSecUserVO extends BaseTable implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1946419113765466831L;
	
	@Id
	@Column(length = 50, name = "EMAIL_ADDR")
	private String emailAddr;
	
	@Column(length = 50, name = "USER_NAME")
	private String userName;

	@Column(length = 10, name = "USER_PWD")
	private String userPwd;
	
	@Column(length = 15, name = "MODUL_ID")	
	private String modulId;

	@Column(length = 60, name = "BIRTH_PLACE")
	private String birthPlace;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "BIRTH_DATE")
	private Date birthDate;
	
	@Column(length = 60, name = "MOBILE_PHONE")
	private String mobilePhone;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "LAST_LOGON_TIMESTAMP")
	private Date lastLogonTimestamp;
	
	@Column(length = 1, name = "CONFIRMED")
	private String confirmed;
	
	@Column(length = 50, name = "FULL_NAME")
	private String fullName;
	
	@Column(length = 10, name = "BRANCH_ID")
	private String branchId;
	
	@Column(length = 5, name = "BUSS_UNIT")
	private String bussUnit;
	
	@Column(length = 30, name = "PHONE_SN")
	private String phoneSN;
		
	public MstSecUserVO() {
//		setId(java.util.UUID.randomUUID().toString());
		setCreatedTimestamp(new Date());
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getModulId() {
		return modulId;
	}

	public void setModulId(String modulId) {
		this.modulId = modulId;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

	public Date getLastLogonTimestamp() {
		return lastLogonTimestamp;
	}

	public void setLastLogonTimestamp(Date lastLogonTimestamp) {
		this.lastLogonTimestamp = lastLogonTimestamp;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBussUnit() {
		return bussUnit;
	}

	public void setBussUnit(String bussUnit) {
		this.bussUnit = bussUnit;
	}

	public String getPhoneSN() {
		return phoneSN;
	}

	public void setPhoneSN(String phoneSN) {
		this.phoneSN = phoneSN;
	}

	
}
