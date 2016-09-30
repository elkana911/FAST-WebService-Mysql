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
@Table(name = "mc_process_log")
public class ProcessLog extends BaseTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ProcessLogPK pk;
	
	@Column(name = "COUNT_REC_ORACLE")
	private Long countRecOracle;
	
	@Column(name = "COUNT_REC_MYSQL")
	private Long countRecMySql;
	
	@Column(length = 5, name = "PROCESS_FLAG")
	private String processFlag;
	
	@Column(length = 100, name = "PROC_NAME")
	private String procName;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	@Column(name = "STARTED_TIMESTAMP")
	private Date startedTimestamp;

	public ProcessLogPK getPk() {
		return pk;
	}

	public void setPk(ProcessLogPK pk) {
		this.pk = pk;
	}

	public Long getCountRecOracle() {
		return countRecOracle;
	}

	public void setCountRecOracle(Long countRecOracle) {
		this.countRecOracle = countRecOracle;
	}

	public Long getCountRecMySql() {
		return countRecMySql;
	}

	public void setCountRecMySql(Long countRecMySql) {
		this.countRecMySql = countRecMySql;
	}

	public String getProcessFlag() {
		return processFlag;
	}

	public void setProcessFlag(String processFlag) {
		this.processFlag = processFlag;
	}

	public String getProcName() {
		return procName;
	}

	public void setProcName(String procName) {
		this.procName = procName;
	}

	public Date getStartedTimestamp() {
		return startedTimestamp;
	}

	public void setStartedTimestamp(Date startedTimestamp) {
		this.startedTimestamp = startedTimestamp;
	}

}
