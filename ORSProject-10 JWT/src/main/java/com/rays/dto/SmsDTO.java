package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_sms")
public class SmsDTO extends BaseDTO {
	
	@Column(name = "smsId", length = 50)
	private String smsId;
	
	@Column(name = "smsCode", length = 50)
	private String smsCode;
	
	@Column(name = "phoneNumber", length = 50)
	private String phoneNumber;
	
	@Column(name = "message", length = 50)
	private String  message;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getSmsId() {
		return smsId;
	}

	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return smsId;
	}

	@Override
	public String getUniqueKey() {
		return "smsId";
	}

	@Override
	public String getUniqueValue() {
		return smsId;
	}

	@Override
	public String getLabel() {
		return "Sms Id";
	}

	@Override
	public String getTableName() {
		return "Sms";
	}
}
