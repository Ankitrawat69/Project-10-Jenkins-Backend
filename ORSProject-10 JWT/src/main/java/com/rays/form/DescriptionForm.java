package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DescriptionDTO;

public class DescriptionForm extends BaseForm{
	
	@NotEmpty(message = "descriptionId is required")
	private String descriptionId;
	
	@NotEmpty(message = "descriptionCode is required")
	private String descriptionCode ;
	
	@NotEmpty(message = "algorithm is required")
	private String algorithm ;
	
	@NotEmpty(message = "keyUsed is required")
	private String keyUsed;

	@NotEmpty(message = "status is required")
	private String status;

	public String getDescriptionId() {
		return descriptionId;
	}

	public void setDescriptionId(String descriptionId) {
		this.descriptionId = descriptionId;
	}

	public String getDescriptionCode() {
		return descriptionCode;
	}

	public void setDescriptionCode(String descriptionCode) {
		this.descriptionCode = descriptionCode;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getKeyUsed() {
		return keyUsed;
	}

	public void setKeyUsed(String keyUsed) {
		this.keyUsed = keyUsed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		
		DescriptionDTO dto = initDTO(new DescriptionDTO());
		               dto.setDescriptionId(descriptionId);
		               dto.setDescriptionCode(descriptionCode);
		               dto.setAlgorithm(algorithm);
		               dto.setKeyUsed(keyUsed);
		               dto.setStatus(status);
	            return dto;
	}

}
