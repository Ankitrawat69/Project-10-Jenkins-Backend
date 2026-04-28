package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_state")
public class StateDTO extends BaseDTO{
	
	@Column(name = "stateId", length = 50)
	private String stateId;
	
	@Column(name = "stateCode", length = 50)
	private String stateCode;
	
	@Column(name = "stateName", length = 50)
	private String stateName;
	
	@Column(name = "countryName", length = 50)
	private String countryName;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return stateId;
	}

	@Override
	public String getUniqueKey() {
		return "stateId";
	}

	@Override
	public String getUniqueValue() {
		return stateId;
	}

	@Override
	public String getLabel() {
		return "State Id";
	}

	@Override
	public String getTableName() {
		return "State";
	}
}
