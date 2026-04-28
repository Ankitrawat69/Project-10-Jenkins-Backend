package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SmsDTO;

public class SmsForm extends BaseForm {
	
	@NotEmpty(message = "smsId is required")
	@Pattern(regexp = "^[0-9]+$", message = "smsId must contain only digits")
	private String smsId;
	
	@NotEmpty(message = "smsCode is required")
	private String smsCode;
	
	@NotEmpty(message = "phoneNumber is required")
	private String phoneNumber;
	
	@NotEmpty(message = "message is required")
	private String  message;
	
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		
		SmsDTO dto = initDTO(new SmsDTO());
		       dto.setSmsId(smsId);
		       dto.setSmsCode(smsCode);
		       dto.setPhoneNumber(phoneNumber);
		       dto.setMessage(message);
		       dto.setStatus(status);
		return dto;
	}
}
