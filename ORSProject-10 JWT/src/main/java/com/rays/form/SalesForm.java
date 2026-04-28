package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SalesDTO;

public class SalesForm  extends BaseForm{
	
	@NotEmpty(message = "salesId is required")
    private String salesId;
	
	@NotEmpty(message = "salesCode is required")
	private String salesCode;
	
	@NotEmpty(message = "customerName is required")
	private String customerName;;
	
	@NotEmpty(message = "amount is required")
	private String amount;
	
	@NotEmpty(message = "status is required")
	private String status;

	public String getSalesId() {
		return salesId;
	}

	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}

	public String getSalesCode() {
		return salesCode;
	}

	public void setSalesCode(String salesCode) {
		this.salesCode = salesCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
	
		SalesDTO dto = initDTO(new SalesDTO());
		         dto.setSalesId(salesId);
		         dto.setSalesCode(salesCode);
		         dto.setCustomerName(customerName);
		         dto.setAmount(amount);
		         dto.setStatus(status);
		  return dto;
	}
	
}
