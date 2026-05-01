package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.NotificationChannelDTO;

public class NotificationChannelForm extends BaseForm {
	
	@NotEmpty(message = "channelId is required")
	private String channelId;
	
	@NotEmpty(message = "channelCode is required")
	private String channelCode;
	
	@NotEmpty(message = "channelName is required")
	private String channelName;
	
	@NotEmpty(message = "type is required")
	private String type;
	
	@NotEmpty(message = "status is required")
	private String status;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		NotificationChannelDTO dto = initDTO(new NotificationChannelDTO());
        dto.setChannelId(channelId);
        dto.setChannelCode(channelCode);
        dto.setChannelName(channelName);
        dto.setType(type);
        dto.setStatus(status);
 return dto;
}


}
