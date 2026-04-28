package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_sales")
public class SalesDTO extends BaseDTO {
	
	@Column(name = "salesId", length = 100)
	private String salesId;
	
	@Column(name = "salesCode", length = 100)
	private String salesCode;
	
	@Column(name = "customerName", length = 100)
	private String customerName;;
	
	@Column(name = "amount", length = 100)
	private String amount;
	
	@Column(name = "status", length = 100)
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
	public String getValue() {
		return salesId;
	}

	@Override
	public String getUniqueKey() {
		return "salesId";
	}

	@Override
	public String getUniqueValue() {
		return salesId;
	}

	@Override
	public String getLabel() {
		return "Sales Id";
	}

	@Override
	public String getTableName() {
		return "Sales";
	}
	
	
}
