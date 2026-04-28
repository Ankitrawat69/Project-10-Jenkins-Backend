package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LockerDTO;

public class LockerForm extends BaseForm {
	
	@NotEmpty(message = "lockerId is required")
	private String lockerId;
	
	@NotEmpty(message = "lockerNumber is required")
	private String lockerNumber;
	
	@NotEmpty(message = "lockerType is required")
	private String lockerType;
	
	@NotEmpty(message = "annualFee is required")
	private String annualFee;

	public String getLockerId() {
		return lockerId;
	}

	public void setLockerId(String lockerId) {
		this.lockerId = lockerId;
	}

	public String getLockerNumber() {
		return lockerNumber;
	}

	public void setLockerNumber(String lockerNumber) {
		this.lockerNumber = lockerNumber;
	}

	public String getLockerType() {
		return lockerType;
	}

	public void setLockerType(String lockerType) {
		this.lockerType = lockerType;
	}

	public String getAnnualFee() {
		return annualFee;
	}

	public void setAnnualFee(String annualFee) {
		this.annualFee = annualFee;
	}
	
	@Override
	public BaseDTO getDto() {
		
		LockerDTO dto = initDTO(new LockerDTO());
		dto.setLockerId(lockerId);
		dto.setLockerNumber(lockerNumber);
        dto.setAnnualFee(annualFee);
        dto.setLockerType(lockerType);
 return dto;
	    }
	}
