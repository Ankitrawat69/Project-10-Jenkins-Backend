package com.rays.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_webhook")
public class WebhookDTO extends BaseDTO {
	
	@Column(name = "webhookId", length = 50)
    private  String webhookId;
	
	@Column(name = "webhookCode", length = 50)
	private String webhookCode;
	
	@Column(name = "url", length = 50)
	private String url;
	
	@Column(name = "eventType", length = 50)
	private Date eventType;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return webhookId;
	}

	@Override
	public String getUniqueKey() {
		return "webhookId";
	}

	@Override
	public String getUniqueValue() {
		return webhookId;
	}

	@Override
	public String getLabel() {
		return "Webhook Id";
	}

	@Override
	public String getTableName() {
		return "Webhook";
	}
	
	

}
