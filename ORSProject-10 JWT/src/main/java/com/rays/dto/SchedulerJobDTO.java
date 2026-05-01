package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_schedulerJob")
public class SchedulerJobDTO extends BaseDTO  {
	
	@Column(name = "jobId", length = 50)
	private String jobId;
	
	@Column(name = "jobCode", length = 50)
	private String jobCode;
	
	@Column(name = "jobName", length = 50)
	private String jobName;
	
	@Column(name = "cronExpression", length = 50)
	private String cronExpression;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return jobId;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "jobId";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return jobId;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Job Id";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Job Id";
	}
	
	
}
