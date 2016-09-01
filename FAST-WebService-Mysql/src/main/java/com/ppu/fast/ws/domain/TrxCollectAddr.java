package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mc_trn_collect_addr")
public class TrxCollectAddr extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 20, name = "CONTRACT_NO")
	private String contractNo;

	@Embedded
	private SeqNo seq;
	
	@Column(length = 135, name = "COLLEC_ADDR")
	private String collAddr;
	
	@Column(length = 5, name = "COLLEC_RT")
	private String collRt;
	
	@Column(length = 5, name = "COLLEC_RW")	
	private String collRw;
	
	@Column(length = 10, name = "COLLEC_KEL_CODE")
	private String collKelCode;
	
	@Column(length = 100, name = "COLLEC_KEL")
	private String collKel;
	
	@Column(length = 10, name = "COLLEC_KEC_CODE")
	private String collKecCode;
	
	@Column(length = 100, name = "COLLEC_KEC")
	private String collKec;
	
	@Column(length = 10, name = "COLLEC_CITY_CODE")
	private String collCityCode;
	
	@Column(length = 100, name = "COLLEC_CITY")
	private String collCity;
	
	@Column(length = 10, name = "COLLEC_ZIP")
	private String collZip;
	
	@Column(length = 10, name = "COLLEC_SUB_ZIP")
	private String collSubZip;
	
	@Column(length = 10, name = "COLLEC_PROV_CODE")
	private String collProvCode;
	
	@Column(length = 100, name = "COLLEC_PROV")
	private String collProv;
	
	@Column(length = 5, name = "COLLEC_FIXPH_AREA")
	private String collFixPhArea;
	
	@Column(length = 15, name = "COLLEC_FIXPHONE")
	private String collFixPhone;
	
	@Column(length = 5, name = "COLLEC_FAX_AREA")
	private String collFaxArea;
	
	@Column(length = 15, name = "COLLEC_FAXIMILE")
	private String collFaximile;
	
	@Column(length = 15, name = "COLLEC_MOBPHONE")
	private String collMobPhone;
	
	@Column(length = 30, name = "COLLEC_EMAIL")
	private String collEmail;
	
	@Column(length = 60, name = "COLLEC_NAME")
	private String collName;
	
	@Column(length = 15, name = "COLLEC_MOBPHONE_2")
	private String collMobPhone2;
	
	@Column(length = 50, name = "COLLEC_NICKNAME")
	private String collNickName;
	
	/*
	@Column(length = 20, name = "CONTRACT_NO")
	private String contractNo;

	public Long getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}
*/
	public String getCollAddr() {
		return collAddr;
	}

	public void setCollAddr(String collAddr) {
		this.collAddr = collAddr;
	}

	public String getCollRt() {
		return collRt;
	}

	public void setCollRt(String collRt) {
		this.collRt = collRt;
	}

	public String getCollRw() {
		return collRw;
	}

	public void setCollRw(String collRw) {
		this.collRw = collRw;
	}

	public String getCollKelCode() {
		return collKelCode;
	}

	public void setCollKelCode(String collKelCode) {
		this.collKelCode = collKelCode;
	}

	public String getCollKel() {
		return collKel;
	}

	public void setCollKel(String collKel) {
		this.collKel = collKel;
	}

	public String getCollKecCode() {
		return collKecCode;
	}

	public void setCollKecCode(String collKecCode) {
		this.collKecCode = collKecCode;
	}

	public String getCollKec() {
		return collKec;
	}

	public void setCollKec(String collKec) {
		this.collKec = collKec;
	}

	public String getCollCityCode() {
		return collCityCode;
	}

	public void setCollCityCode(String collCityCode) {
		this.collCityCode = collCityCode;
	}

	public String getCollCity() {
		return collCity;
	}

	public void setCollCity(String collCity) {
		this.collCity = collCity;
	}

	public String getCollZip() {
		return collZip;
	}

	public void setCollZip(String collZip) {
		this.collZip = collZip;
	}

	public String getCollSubZip() {
		return collSubZip;
	}

	public void setCollSubZip(String collSubZip) {
		this.collSubZip = collSubZip;
	}

	public String getCollProvCode() {
		return collProvCode;
	}

	public void setCollProvCode(String collProvCode) {
		this.collProvCode = collProvCode;
	}

	public String getCollProv() {
		return collProv;
	}

	public void setCollProv(String collProv) {
		this.collProv = collProv;
	}

	public String getCollFixPhArea() {
		return collFixPhArea;
	}

	public void setCollFixPhArea(String collFixPhArea) {
		this.collFixPhArea = collFixPhArea;
	}

	public String getCollFixPhone() {
		return collFixPhone;
	}

	public void setCollFixPhone(String collFixPhone) {
		this.collFixPhone = collFixPhone;
	}

	public String getCollFaxArea() {
		return collFaxArea;
	}

	public void setCollFaxArea(String collFaxArea) {
		this.collFaxArea = collFaxArea;
	}

	public String getCollFaximile() {
		return collFaximile;
	}

	public void setCollFaximile(String collFaximile) {
		this.collFaximile = collFaximile;
	}

	public String getCollMobPhone() {
		return collMobPhone;
	}

	public void setCollMobPhone(String collMobPhone) {
		this.collMobPhone = collMobPhone;
	}

	public String getCollEmail() {
		return collEmail;
	}

	public void setCollEmail(String collEmail) {
		this.collEmail = collEmail;
	}

	public String getCollName() {
		return collName;
	}

	public void setCollName(String collName) {
		this.collName = collName;
	}

	public String getCollMobPhone2() {
		return collMobPhone2;
	}

	public void setCollMobPhone2(String collMobPhone2) {
		this.collMobPhone2 = collMobPhone2;
	}

	public String getCollNickName() {
		return collNickName;
	}

	public void setCollNickName(String collNickName) {
		this.collNickName = collNickName;
	}
/*
	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
*/

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public SeqNo getSeq() {
		return seq;
	}

	public void setSeq(SeqNo seq) {
		this.seq = seq;
	}

}
