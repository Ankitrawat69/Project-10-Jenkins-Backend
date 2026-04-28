package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PipelineDTO;

public class PipelineForm extends BaseForm{
	
	@NotEmpty(message = "pipelineId is required")
	private String pipelineId;
	
	@NotEmpty(message = "pipelineCode is required")
	private String pipelineCode ;
	
	@NotEmpty(message = "pipelineName is required")
	private String pipelineName ;
	
	@NotEmpty(message = "tool is required")
	private String tool;

	@NotEmpty(message = "status is required")
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
	public BaseDTO getDto() {
		
		PipelineDTO dto = initDTO(new PipelineDTO());
		            dto.setPipelineId(pipelineId);
		            dto.setPipelineCode(pipelineCode);
		            dto.setPipelineName(pipelineName);
		            dto.setTool(tool);
		            dto.setStatus(status);
		     return dto;
	}
}
