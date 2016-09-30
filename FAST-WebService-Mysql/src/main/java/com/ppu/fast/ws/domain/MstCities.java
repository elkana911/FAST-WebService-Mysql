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
@Table(name = "fs_mst_cities")
public class MstCities implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 10, name = "CITY_CODE")
	private String cityCode;
	
	@Column(length = 100, name = "CITY")
	private String city;
	
	@Column(length = 10, name = "PROV_CODE")
	private String provCode;
	
	@Column(length = 12, name = "CREATE_BY")
	private String createBy;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(length = 10, name = "UPDATE_DATE")
	private Date updateDate;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;
	
	@Column(length = 10, name = "UPDATE_BY")
	private String updateBy;

	@Column(length = 10, name = "SANDI_BI")
	private String sandiBI;
	
	@Column(length = 4, name = "NIAGA_CODE_DATI_II")
	private String niagaCodeDatiII;

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvCode() {
		return provCode;
	}

	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getSandiBI() {
		return sandiBI;
	}

	public void setSandiBI(String sandiBI) {
		this.sandiBI = sandiBI;
	}

	public String getNiagaCodeDatiII() {
		return niagaCodeDatiII;
	}

	public void setNiagaCodeDatiII(String niagaCodeDatiII) {
		this.niagaCodeDatiII = niagaCodeDatiII;
	}
	
	
}
