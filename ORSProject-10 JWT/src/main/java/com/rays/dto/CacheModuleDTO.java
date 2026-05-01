package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_cache")
public class CacheModuleDTO extends BaseDTO {
	
	@Column(name = "cacheId", length = 50)
	private String cacheId;
	
	@Column(name = "cacheCode", length = 50)
	private String cacheCode;
	
	@Column(name = "keyName", length = 50)
	private String keyName;
	
	@Column(name = "value", length = 50)
	private String value;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getCacheId() {
		return cacheId;
	}

	public void setCacheId(String cacheId) {
		this.cacheId = cacheId;
	}

	public String getCacheCode() {
		return cacheCode;
	}

	public void setCacheCode(String cacheCode) {
		this.cacheCode = cacheCode;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getUniqueKey() {
		return "cacheId";
	}

	@Override
	public String getUniqueValue() {
		return cacheId;
	}

	@Override
	public String getLabel() {
		return "Cache Id";
	}

	@Override
	public String getTableName() {
		return "cache";
	}
}
