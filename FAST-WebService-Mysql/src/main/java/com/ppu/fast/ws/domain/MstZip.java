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
@Table(name = "mc_mst_zip")
public class MstZip extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MstZipPK pk;
	
	@Column(length = 100, name = "ZIP_DESC")
	private String zipDesc;

	@Column(length = 10, name = "PROV_CODE")
	private String provCode;
	
	@Column(length = 10, name = "CITY_CODE")
	private String cityCode;
	
	@Column(length = 10, name = "KEC_CODE")
	private String kecCode;
	
	@Column(length = 10, name = "KEL_CODE")
	private String kelCode;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public MstZipPK getPk() {
		return pk;
	}

	public void setPk(MstZipPK pk) {
		this.pk = pk;
	}

	public String getZipDesc() {
		return zipDesc;
	}

	public void setZipDesc(String zipDesc) {
		this.zipDesc = zipDesc;
	}

	public String getProvCode() {
		return provCode;
	}

	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getKecCode() {
		return kecCode;
	}

	public void setKecCode(String kecCode) {
		this.kecCode = kecCode;
	}

	public String getKelCode() {
		return kelCode;
	}

	public void setKelCode(String kelCode) {
		this.kelCode = kelCode;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}
	
}
