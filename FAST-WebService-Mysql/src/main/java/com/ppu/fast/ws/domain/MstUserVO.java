package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mc_mst_user")
public class MstUserVO extends BaseTable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7338157471213914224L;
	
	@Id
	@Column(length = 35, name = "USER_ID")
	private String userId;

	@Column(length = 5, name = "BRANCH_ID")
	private String branchId;
	
	@Column(length = 100, name = "BRANCH_NAME")
	private String branchName;
	
	@Column(length = 35, name = "EMAIL_ADDR")
	private String emailAddr;
	
	@Column(length = 5, name = "USER_STATUS")
	private String userStatus;

	@Column(length = 1, name = "EMAIL_STATUS")
	private String emailStatus;
	
	@Column(length = 80, name = "JABATAN")
	private String jabatan;
	
	@Column(length = 20, name = "NIK")
	private String nik;
	
	@Column(length = 200, name = "ALAMAT")
	private String alamat;
	
	@Column(length = 20, name = "PHONE_NO")
	private String phoneNo;
	
	@Column(length = 3, name = "COLLECTOR_TYPE")
	private String collectorType;
	
	public MstUserVO() {
//		setId(java.util.UUID.randomUUID().toString());
//		setCreated_date(new Date());
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getEmailStatus() {
		return emailStatus;
	}

	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCollectorType() {
		return collectorType;
	}

	public void setCollectorType(String collectorType) {
		this.collectorType = collectorType;
	}

}
