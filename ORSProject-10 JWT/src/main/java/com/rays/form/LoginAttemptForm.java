package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LoginAttemptDTO;

public class LoginAttemptForm extends BaseForm {
	
	@NotEmpty(message = "attemptId is required")
    private String attemptId;
	
	@NotEmpty(message = "attemptCode is required")
	private String attemptCode;
	
	@NotEmpty(message = "userName is required")
	private String userName;
	
	@NotEmpty(message = "attemptTime is required")
	private String attemptTime;
	
	@NotEmpty(message = "status is required")
	private String status;

	public String getAttemptId() {
		return attemptId;
	}

	public void setAttemptId(String attemptId) {
		this.attemptId = attemptId;
	}

	public String getAttemptCode() {
		return attemptCode;
	}

	public void setAttemptCode(String attemptCode) {
		this.attemptCode = attemptCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAttemptTime() {
		return attemptTime;
	}

	public void setAttemptTime(String attemptTime) {
		this.attemptTime = attemptTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		
		LoginAttemptDTO dto = initDTO(new LoginAttemptDTO());
		           dto.setAttemptId(attemptId);
		           dto.setAttemptCode(attemptCode);
		           dto.setUserName(userName);
		           dto.setAttemptTime(attemptTime);
		           dto.setStatus(status);
		    return dto;
	}


}
