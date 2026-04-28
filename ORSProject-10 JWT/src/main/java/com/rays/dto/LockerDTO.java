package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_locker")
public class LockerDTO extends BaseDTO {
	
	@Column(name = "lockerId", length = 50)
	private String lockerId; 
	
	@Column(name = "lockerNumber", length = 50)
	private String lockerNumber;
	
	@Column(name = "lockerType", length = 50)
	private String lockerType;
	
	@Column(name = "annualFee", length = 50)
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
	public String getValue() {
		return lockerId;
	}

	@Override
	public String getUniqueKey() {
		return "lockerId";
	}

	@Override
	public String getUniqueValue() {
		return lockerId;
	}

	@Override
	public String getLabel() {
		return "Locker Id";
	}

	@Override
	public String getTableName() {
		return "Locker";
	}
}
