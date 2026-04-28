package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_subscriptionUsage")
public class SubscriptionUsageDTO extends BaseDTO{
	
	@Column(name = "usageId", length = 50)
	private String usageId;
	
	@Column(name = "usageCode", length = 50)
	private String usageCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "usageCount", length = 50)
	private String usageCount;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getUsageId() {
		return usageId;
	}

	public void setUsageId(String usageId) {
		this.usageId = usageId;
	}

	public String getUsageCode() {
		return usageCode;
	}

	public void setUsageCode(String usageCode) {
		this.usageCode = usageCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUsageCount() {
		return usageCount;
	}

	public void setUsageCount(String usageCount) {
		this.usageCount = usageCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return usageId;
	}

	@Override
	public String getUniqueKey() {
		return "usageId";
	}

	@Override
	public String getUniqueValue() {
		return usageId;
	}

	@Override
	public String getLabel() {
		return "Usage Id";
	}

	@Override
	public String getTableName() {
		return "SubscriptionUsage";
	}
	
}
