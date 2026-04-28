package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_internet")
public class InternetPackageDTO extends BaseDTO {
	
	@Column(name = "packageId", length = 50)
	private String packageId;
	
	@Column(name = "packageName", length = 50)
	private String packageName;
	
	@Column(name = "price", length = 50)
	private String price;
	
	@Column(name = "dataLimit", length = 50)
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
	public String getValue() {
		return packageId;
	}

	@Override
	public String getUniqueKey() {
		return "packageId";
	}

	@Override
	public String getUniqueValue() {
		return packageId;
	}

	@Override
	public String getLabel() {
		return "Package Id";
	}

	@Override
	public String getTableName() {
		return "Internet";
	}
}
