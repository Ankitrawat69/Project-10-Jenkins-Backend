package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_ruleEngine")
public class RuleEngineDTO extends BaseDTO {
	
	@Column(name = "ruleId", length = 50)
	private String ruleId;
	
	@Column(name = "ruleCode", length = 50)
	private String ruleCode;
	
	@Column(name = "ruleName", length = 50)
	private String ruleName;
	
	@Column(name = "conditions", length = 50)
	private String conditions;
	
	@Column(name = "status", length = 50)
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
	public String getValue() {
		return ruleId;
	}

	@Override
	public String getUniqueKey() {
		
		return "ruleId";
	}

	@Override
	public String getUniqueValue() {
		return ruleId;
	}

	@Override
	public String getLabel() {
		return "Rule Id";
	}

	@Override
	public String getTableName() {
		return "RuleEngine";
	}

}
