package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SubscriptionUsageDTO;

public class SubscriptionUsageForm extends BaseForm {
	
	@NotEmpty(message = "usageId is required")
    private String usageId;
	
	@NotEmpty(message = "usageCode is required")
	private String usageCode;
	
	@NotEmpty(message = "userName is required")
	private String userName;
	
	@NotEmpty(message = "usageCount is required")
	private String usageCount;
	
	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		
		SubscriptionUsageDTO dto = initDTO(new SubscriptionUsageDTO());
        dto.setUsageId(usageId);
        dto.setUsageCode(usageCode);
        dto.setUserName(userName);
        dto.setUsageCount(usageCount);
        dto.setStatus(status);
 return dto;
}

}

