package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InternetPackageDTO;
import com.rays.dto.WebhookDTO;

public class InternetPackageForm extends BaseForm {
	
	@NotEmpty(message = "packageId is required")
	private String packageId;
	
	@NotEmpty(message = "packageName is required")
	private String packageName;
	
	@NotEmpty(message = "price is required")
	private String price;
	
	@NotEmpty(message = "dataLimit is required")
	private String dataLimit;

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDataLimit() {
		return dataLimit;
	}

	public void setDataLimit(String dataLimit) {
		this.dataLimit = dataLimit;
	}
	
	@Override
	public BaseDTO getDto() {
		
		InternetPackageDTO dto = initDTO(new InternetPackageDTO());
		           dto.setPackageId(packageId);
		           dto.setPackageName(packageName);
		           dto.setPrice(price);
		           dto.setDataLimit(dataLimit);
		    return dto;
	}


}
