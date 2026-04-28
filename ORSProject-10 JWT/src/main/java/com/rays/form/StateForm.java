package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.StateDTO;

public class StateForm extends BaseForm {
	
	@NotEmpty(message = "stateId is required")
    private String stateId;
	
	@NotEmpty(message = "stateCode is required")
	private String stateCode;
	
	@NotEmpty(message = "stateName is required")
	private String stateName;
	
	@NotEmpty(message = "countryName is required")
	private String countryName;
	
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		
		 StateDTO dto = initDTO(new StateDTO());
		          dto.setStateId(stateId);
		          dto.setStateCode(stateCode);
		          dto.setStateName(stateName);
		          dto.setCountryName(countryName);
		          dto.setStatus(status);
		   return dto;
	}
}
