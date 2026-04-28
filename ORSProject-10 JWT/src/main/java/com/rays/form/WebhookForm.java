package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.WebhookDTO;

public class WebhookForm extends BaseForm {
	
	@NotEmpty(message = "webhookId is required")
    private  String webhookId;
	
	@NotEmpty(message = "webhookCode is required")
	private String webhookCode;
	
	@NotEmpty(message = "url is required")
	private String url;
	
	@NotNull(message = "eventType is required")
	private Date eventType;
	
	@NotEmpty(message = "status  is required")
	private String status;

	public String getWebhookId() {
		return webhookId;
	}

	public void setWebhookId(String webhookId) {
		this.webhookId = webhookId;
	}

	public String getWebhookCode() {
		return webhookCode;
	}

	public void setWebhookCode(String webhookCode) {
		this.webhookCode = webhookCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getEventType() {
		return eventType;
	}

	public void setEventType(Date eventType) {
		this.eventType = eventType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		
		WebhookDTO dto = initDTO(new WebhookDTO());
		           dto.setWebhookId(webhookId);
		           dto.setWebhookCode(webhookCode);
		           dto.setUrl(url);
		           dto.setEventType(eventType);
		           dto.setStatus(status);
		    return dto;
	}


}
