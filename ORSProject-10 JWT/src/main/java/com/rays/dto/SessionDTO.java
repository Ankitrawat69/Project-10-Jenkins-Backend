package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_session")
public class SessionDTO extends BaseDTO{
	
	@Column(name = "sessionLogId", length = 50)
	private  String sessionLogId;
	
	@Column(name = "sessionLogCode", length = 50)
	private String sessionLogCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "loginTime", length = 50)
	private Date loginTime;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return sessionLogId;
	}

	@Override
	public String getUniqueKey() {
		return "sessionLogId";
	}

	@Override
	public String getUniqueValue() {
		return sessionLogId;
	}

	@Override
	public String getLabel() {
		return "Session LogId";
	}

	@Override
	public String getTableName() {
		return "Session";
	}

	
}
