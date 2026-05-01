package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SchedulerJobDTO;

public class SchedulerJobForm extends BaseForm {
	
	@NotEmpty(message = "jobId is required")
	private String jobId;
	
	@NotEmpty(message = "jobCode is required")
	private String jobCode;
	
	@NotEmpty(message = "jobName is required")
	private String jobName;
	
	@NotEmpty(message = "cronExpression is required")
	private String cronExpression;
	
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		
		SchedulerJobDTO dto = initDTO(new SchedulerJobDTO());
        dto.setJobId(jobId);
        dto.setJobCode(jobCode);
        dto.setJobName(jobName);
        dto.setCronExpression(cronExpression);
        dto.setStatus(status);
 return dto;
    }

}
