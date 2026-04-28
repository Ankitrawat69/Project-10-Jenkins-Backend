package com.rays.form;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SessionDTO;

public class SessionForm extends BaseForm{

	@NotEmpty(message = "sessionLogId is required")
	private  String sessionLogId;
	
	@NotEmpty(message = "sessionLogCode is required")
	private String sessionLogCode;
	
	@NotEmpty(message = "userName is required")
	private String userName;
	
	@NotNull(message = "loginTime is required")
	private Date loginTime;
	
	@NotEmpty(message = "status is required")
	private String status;

	public String getSessionLogId() {
		return sessionLogId;
	}

	public void setSessionLogId(String sessionLogId) {
		this.sessionLogId = sessionLogId;
	}

	public String getSessionLogCode() {
		return sessionLogCode;
	}

	public void setSessionLogCode(String sessionLogCode) {
		this.sessionLogCode = sessionLogCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		
		SessionDTO dto = initDTO(new SessionDTO());
		           dto.setSessionLogId(sessionLogId);
		           dto.setSessionLogCode(sessionLogCode);
		           dto.setUserName(userName);
		           dto.setLoginTime(loginTime);
		           dto.setStatus(status);
		    return dto;
	}
}
