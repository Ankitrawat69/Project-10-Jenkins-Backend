package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_allowList")
public class AllowListDTO extends BaseDTO {
	
	@Column(name = "allowId", length = 50)
	private String allowId;
	
	@Column(name = "allowCode", length = 50)
	private String allowCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "source", length = 50)
	private String source;

	@Column(name = "status", length = 50)
	private String status;

	public String getAllowId() {
		return allowId;
	}

	public void setAllowId(String allowId) {
		this.allowId = allowId;
	}

	public String getAllowCode() {
		return allowCode;
	}

	public void setAllowCode(String allowCode) {
		this.allowCode = allowCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return allowId;
	}

	@Override
	public String getUniqueKey() {
		return "allowId";
	}

	@Override
	public String getUniqueValue() {
		return allowId;
	}

	@Override
	public String getLabel() {
		return "Allow Id";
	}

	@Override
	public String getTableName() {
		return "AllowLisT";
	}
}
