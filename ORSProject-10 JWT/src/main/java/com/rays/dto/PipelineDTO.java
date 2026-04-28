package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_pipeline")
public class PipelineDTO extends BaseDTO {
	
	@Column(name = "pipelineId", length = 50)
	private String pipelineId;
	
	@Column(name = "pipelineCode", length = 50)
	private String pipelineCode ;
	
	@Column(name = "pipelineName", length = 50)
	private String pipelineName ;
	
	@Column(name = "tool", length = 50)
	private String tool ;

	@Column(name = "status", length = 50)
	private String status;

	public String getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getPipelineCode() {
		return pipelineCode;
	}

	public void setPipelineCode(String pipelineCode) {
		this.pipelineCode = pipelineCode;
	}

	public String getPipelineName() {
		return pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		return pipelineId;
	}

	@Override
	public String getUniqueKey() {
		return "pipelineId";
	}

	@Override
	public String getUniqueValue() {
		return pipelineId;
	}

	@Override
	public String getLabel() {
		return "Pipeline Id";
	}

	@Override
	public String getTableName() {
		return "Pipeline";
	}
}
