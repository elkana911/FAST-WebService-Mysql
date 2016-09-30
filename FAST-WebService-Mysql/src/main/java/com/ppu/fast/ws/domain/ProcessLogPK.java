package com.ppu.fast.ws.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.ppu.fast.ws.common.JsonDateTimeSerializer;

@Embeddable
public class ProcessLogPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1622052377952880117L;

	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "PROCESS_DATE")
	private Date processDate;
	
	@Column(length = 100, name = "TABLE_NAME")
	private String tableName;

	@Column(length = 20, name = "EMPL_CODE")
	private String emplCode;
	
	@Column(length = 5, name = "OFFICE_CODE")
	private String officeCode;
	
	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emplCode == null) ? 0 : emplCode.hashCode());
		result = prime * result + ((officeCode == null) ? 0 : officeCode.hashCode());
		result = prime * result + ((processDate == null) ? 0 : processDate.hashCode());
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProcessLogPK other = (ProcessLogPK) obj;
		if (emplCode == null) {
			if (other.emplCode != null)
				return false;
		} else if (!emplCode.equals(other.emplCode))
			return false;
		if (officeCode == null) {
			if (other.officeCode != null)
				return false;
		} else if (!officeCode.equals(other.officeCode))
			return false;
		if (processDate == null) {
			if (other.processDate != null)
				return false;
		} else if (!processDate.equals(other.processDate))
			return false;
		if (tableName == null) {
			if (other.tableName != null)
				return false;
		} else if (!tableName.equals(other.tableName))
			return false;
		return true;
	}


}
