package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AccountDTO;

public class AccountForm extends BaseForm { 
	
	@NotEmpty(message = "accountId is required")
    private  String accountId;
	
	@NotEmpty(message = "accountCode is required")
	private String accountCode;
	
	@NotEmpty(message = "userName is required")
	private String userName;
	
	@NotNull(message = "accountType is required")
	private Date accountType;
	
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		AccountDTO dto = initDTO(new AccountDTO());
        dto.setAccountId(accountId);
        dto.setAccountCode(accountCode);
        dto.setUserName(userName);
        dto.setAccountType(accountType);
        dto.setStatus(status);
 return dto;
}


}