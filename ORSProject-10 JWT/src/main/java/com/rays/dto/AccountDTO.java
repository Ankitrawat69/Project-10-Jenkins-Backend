package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_account")
public class AccountDTO extends BaseDTO {
	
	@Column(name = "accountId", length = 50)
    private  String accountId;
	
	@Column(name = "accountCode", length = 50)
	private String accountCode;
	
	@Column(name = "userName", length = 50)
	private String userName;
	
	@Column(name = "accountType", length = 50)
	private Date accountType;
	
	@Column(name = "status", length = 50)
	private String status;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getAccountType() {
		return accountType;
	}

	public void setAccountType(Date accountType) {
		this.accountType = accountType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "accountId";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return accountId;
	}

	@Override
	public String getLabel() {
		
		return "Account Id";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Account";
	}

	

}
