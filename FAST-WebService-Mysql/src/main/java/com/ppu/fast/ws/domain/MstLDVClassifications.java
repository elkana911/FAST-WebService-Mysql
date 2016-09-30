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
@Table(name = "mc_mst_ldv_classifications")
public class MstLDVClassifications extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(length = 5, name = "CLASS_CODE")
	private String classCode;
	
	@Column(length = 100, name = "DESCRIPTION")
	private String description;
	
	@Column(length = 5, name = "NEED_SPECIAL_COLLECT")
	private String needSpecialCollect;
	
	@Column(length = 5, name = "VISIBLE")
	private String visible;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimetamp;

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNeedSpecialCollect() {
		return needSpecialCollect;
	}

	public void setNeedSpecialCollect(String needSpecialCollect) {
		this.needSpecialCollect = needSpecialCollect;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public Date getStartedTimetamp() {
		return startedTimetamp;
	}

	public void setStartedTimetamp(Date startedTimetamp) {
		this.startedTimetamp = startedTimetamp;
	}
	
	
	
}
