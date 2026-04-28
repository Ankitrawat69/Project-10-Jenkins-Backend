package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_portfolio")
public class PortfolioDTO extends BaseDTO {
	
	@Column(name = "portfolioId", length = 50)
	private String portfolioId;
	
	@Column(name = "portfolioName", length = 50)
	private String portfolioName;
	
	@Column(name = "totalValue", length = 50)
	private String totalValue;
	
	@Column(name = "createdDate", length = 50)
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
	public String getValue() {
		return portfolioId;
	}

	@Override
	public String getUniqueKey() {
		return "portfolioId";
	}

	@Override
	public String getUniqueValue() {
		return portfolioId;
	}

	@Override
	public String getLabel() {
		return "Portfolio Id";
	}

	@Override
	public String getTableName() {
		return "Portfolio";
	}
	
	

}
