package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RuleEngineDTO;

@Repository
public class RuleEngineDAOImpl extends BaseDAOImpl<RuleEngineDTO> implements RuleEngineDAOInt {

	@Override
	public Class<RuleEngineDTO> getDTOClass() {
		return RuleEngineDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(RuleEngineDTO dto, CriteriaBuilder builder, Root<RuleEngineDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getRuleId())) {
			whereCondition.add(builder.like(qRoot.get("ruleId"), dto.getRuleId() + "%"));
		}
		return whereCondition;
	}

}

