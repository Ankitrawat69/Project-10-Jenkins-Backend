package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PortfolioDTO;

 public class PortfolioForm extends BaseForm{
	
	 @NotEmpty(message = "portfolioId is required")
	private String portfolioId;
	
	 @NotEmpty(message = "portfolioName is required")
	private String portfolioName;
	
	 @NotEmpty(message = "totalValue is required")
	private String totalValue;
	
	 @NotNull(message = "createdDate is required")
	private Date createdDate;

	public String getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public String getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	 @Override
	public BaseDTO getDto() {
		 
		 PortfolioDTO dto = initDTO(new PortfolioDTO());
		              dto.setPortfolioId(portfolioId);
		              dto.setPortfolioName(portfolioName);
		              dto.setTotalValue(totalValue);
		              dto.setCreatedBy(portfolioId);
		       return dto;
	}

}
