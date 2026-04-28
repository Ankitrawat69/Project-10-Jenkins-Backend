package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.RuleEngineDTO;

public class RuleEngineForm extends BaseForm {
	
	@NotEmpty(message = "ruleId is required")
    private String ruleId;
	
    @NotEmpty(message = "ruleCode is required")
	private String ruleCode;
	
    @NotEmpty(message = "ruleName is required")
	private String ruleName;
	
    @NotEmpty(message = "conditions is required")
	private String conditions;
	
    @NotEmpty(message = "status is required")
	private String status;

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleCode() {
		return ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
    @Override
    public BaseDTO getDto() {
    	RuleEngineDTO dto = initDTO(new RuleEngineDTO());
        dto.setRuleId(ruleId);
        dto.setRuleCode(ruleCode);
        dto.setRuleName(ruleName);
        dto.setConditions(conditions);
        dto.setStatus(status);
   return dto;
  }
}
