package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_loginAttempt")
public class LoginAttemptDTO extends BaseDTO {
	
	@Column(name = "attemptId", length = 50)
	private String attemptId;
	
	@Column(name = "attemptCode", length = 50)
	private String attemptCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "attemptTime", length = 50)
	private String attemptTime;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return attemptId;
	}

	@Override
	public String getUniqueKey() {
		return "attemptId";
	}

	@Override
	public String getUniqueValue() {
		return attemptId;
	}

	@Override
	public String getLabel() {
		return "Attempt Id";
	}

	@Override
	public String getTableName() {
		return "LoginAttempt";
	}
}
