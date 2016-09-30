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
@Table(name = "mc_trn_change_addr")
public class TrnChangeAddr extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TrnChangeAddrPK pk;
	
	@Column(length = 30, name = "COLL_ID")
	private String collId;
	
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
	private String collNickname;
	
	@Column(length = 10, name = "STATUS")
	private String status;
	
	@Column(length = 5, name = "OFFICE_CODE")
	private String officeCode;

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

	@Column(length = 1, name = "FLAG_CHANGED")
	private String flagChanged;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "DATE_CHANGED")
	private Date dateChanged;

	public TrnChangeAddrPK getPk() {
		return pk;
	}

	public void setPk(TrnChangeAddrPK pk) {
		this.pk = pk;
	}

	public String getCollId() {
		return collId;
	}

	public void setCollId(String collId) {
		this.collId = collId;
	}

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

	public String getCollNickname() {
		return collNickname;
	}

	public void setCollNickname(String collNickname) {
		this.collNickname = collNickname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
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

	public String getFlagChanged() {
		return flagChanged;
	}

	public void setFlagChanged(String flagChanged) {
		this.flagChanged = flagChanged;
	}

	public Date getDateChanged() {
		return dateChanged;
	}

	public void setDateChanged(Date dateChanged) {
		this.dateChanged = dateChanged;
	}
	
}
