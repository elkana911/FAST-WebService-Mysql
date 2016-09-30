package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

/**
 * DELQ: Delequin: keterlambatan bayar
 * @author Administrator
 *
 */
@Entity
@Table(name = "mc_mst_delq_reasons")
public class MstDelqReasons extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(length = 5, name = "DELQ_CODE")
	private String delqCode;
	
	@Column(length = 100, name = "DESCRIPTION")
	private String description;
	
	@Column(length = 15, name = "DESC_SHORT")
	private String descShort;
	
	@Column(length = 5, name = "VISIBLE")
	private String visible;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public String getDelqCode() {
		return delqCode;
	}

	public void setDelqCode(String delqCode) {
		this.delqCode = delqCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescShort() {
		return descShort;
	}

	public void setDescShort(String descShort) {
		this.descShort = descShort;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}
	
	
}
