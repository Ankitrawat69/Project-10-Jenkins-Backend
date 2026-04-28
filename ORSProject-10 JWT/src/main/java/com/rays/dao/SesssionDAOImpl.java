package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SessionDTO;

@Repository
public class SesssionDAOImpl extends BaseDAOImpl<SessionDTO> implements SessionDAOInt {

	@Override
	public Class<SessionDTO> getDTOClass() {
		return SessionDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SessionDTO dto, CriteriaBuilder builder,
			Root<SessionDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSessionLogId())) {
			whereCondition.add(builder.like(qRoot.get("sessionLogId"), dto.getSessionLogId() + "%"));
		}
		return whereCondition;
	}

}
