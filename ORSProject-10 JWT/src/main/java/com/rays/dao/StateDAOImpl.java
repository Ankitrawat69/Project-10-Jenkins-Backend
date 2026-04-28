package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.StateDTO;

@Repository
public class StateDAOImpl extends BaseDAOImpl<StateDTO> implements StateDAOInt {

	@Override
	public Class<StateDTO> getDTOClass() {
		return StateDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(StateDTO dto, CriteriaBuilder builder, Root<StateDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getStateId())) {
			whereCondition.add(builder.like(qRoot.get("stateId"), dto.getStateId() + "%"));
		}
		return whereCondition;
	}

}
