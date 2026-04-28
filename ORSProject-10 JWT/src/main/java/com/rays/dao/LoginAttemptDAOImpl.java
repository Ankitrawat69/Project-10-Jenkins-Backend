package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LoginAttemptDTO;

@Repository
public class LoginAttemptDAOImpl extends BaseDAOImpl<LoginAttemptDTO> implements LoginAttemptDAOInt {

	@Override
	public Class<LoginAttemptDTO> getDTOClass() {
		return LoginAttemptDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LoginAttemptDTO dto, CriteriaBuilder builder,
			Root<LoginAttemptDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAttemptId())) {
			whereCondition.add(builder.like(qRoot.get("attemptId()"), dto.getAttemptId() + "%"));
		}
		return whereCondition;
	}

}
