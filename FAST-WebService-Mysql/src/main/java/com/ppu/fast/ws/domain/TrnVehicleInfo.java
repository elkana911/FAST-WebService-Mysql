package com.ppu.fast.ws.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mc_trn_vehicle_info")
public class TrnVehicleInfo extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7338157471213914224L;
	
	@Id
	@Column(length = 20, name = "CONTRACT_NO")
	private String contractNo;

	@Column(length = 50, name = "OBJ_CATEGORY")
	private String objCategory;
	
	@Column(length = 15, name = "OBJ_BRAND")
	private String objBrand;
	
	@Column(length = 50, name = "OBJ_TYPE")
	private String objType;
	
	@Column(length = 20, name = "WARNA")
	private String warna;
	
	@Column(length = 20, name = "NO_POLISI")
	private String noPolisi;
	
	@Column(length = 25, name = "NOSIN")
	private String nosin;
	
	@Column(length = 25, name = "NOKA")
	private String noka;
	
	@Column(name = "OBJ_TAHUN")
	private Long objTahun;
	
	@Column(length = 150, name = "BPKB_NAME")
	private String bpkbName;
	
	@Column(length = 30, name = "BPKB_ID_NO")
	private String bpkbIdNo;
	
	@Column(length = 255, name = "BPKB_ADDRESS")
	private String bpkbAddress;


	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getObjCategory() {
		return objCategory;
	}

	public void setObjCategory(String objCategory) {
		this.objCategory = objCategory;
	}

	public String getObjBrand() {
		return objBrand;
	}

	public void setObjBrand(String objBrand) {
		this.objBrand = objBrand;
	}

	public String getObjType() {
		return objType;
	}

	public void setObjType(String objType) {
		this.objType = objType;
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public String getNoPolisi() {
		return noPolisi;
	}

	public void setNoPolisi(String noPolisi) {
		this.noPolisi = noPolisi;
	}

	public String getNosin() {
		return nosin;
	}

	public void setNosin(String nosin) {
		this.nosin = nosin;
	}

	public String getNoka() {
		return noka;
	}

	public void setNoka(String noka) {
		this.noka = noka;
	}

	public Long getObjTahun() {
		return objTahun;
	}

	public void setObjTahun(Long objTahun) {
		this.objTahun = objTahun;
	}

	public String getBpkbName() {
		return bpkbName;
	}

	public void setBpkbName(String bpkbName) {
		this.bpkbName = bpkbName;
	}

	public String getBpkbIdNo() {
		return bpkbIdNo;
	}

	public void setBpkbIdNo(String bpkbIdNo) {
		this.bpkbIdNo = bpkbIdNo;
	}

	public String getBpkbAddress() {
		return bpkbAddress;
	}

	public void setBpkbAddress(String bpkbAddress) {
		this.bpkbAddress = bpkbAddress;
	}
	


}
