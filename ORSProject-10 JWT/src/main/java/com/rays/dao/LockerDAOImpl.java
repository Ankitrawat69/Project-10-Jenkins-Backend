package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LockerDTO;

@Repository
public class LockerDAOImpl extends BaseDAOImpl<LockerDTO> implements LockerDAOInt  {

	@Override
	public Class<LockerDTO> getDTOClass() {
		return LockerDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LockerDTO dto, CriteriaBuilder builder, Root<LockerDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getLockerId())) {
			whereCondition.add(builder.like(qRoot.get("lockerId()"),dto.getLockerId() + "%"));
		}
		return whereCondition;
	}
}
