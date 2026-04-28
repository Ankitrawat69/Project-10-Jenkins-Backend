package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SalesDTO;

@Repository
public class SalesDAOImpl extends BaseDAOImpl<SalesDTO> implements SalesDAOInt {

	@Override
	public Class<SalesDTO> getDTOClass() {
		return SalesDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SalesDTO dto, CriteriaBuilder builder, Root<SalesDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSalesId())) {
			whereCondition.add(builder.like(qRoot.get("salesId"), dto.getSalesId() + "%"));
		}
		return whereCondition;
	}

}