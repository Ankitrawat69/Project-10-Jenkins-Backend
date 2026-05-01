package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_notificationChannel")
public class NotificationChannelDTO extends BaseDTO {
	
	@Column(name = "channelId", length = 50)
	private String channelId;
	
	@Column(name = "channelCode", length = 50)
	private String channelCode;
	
	@Column(name = "channelName", length = 50)
	private String channelName;
	
	@Column(name = "type", length = 50)
	private String type;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return channelId;
	}

	@Override
	public String getUniqueKey() {
		return "channelId";
	}

	@Override
	public String getUniqueValue() {
		return channelId;
	}

	@Override
	public String getLabel() {
		return "Channel Id";
	}

	@Override
	public String getTableName() {
		return "NotificationChannel";
	}
	
}
