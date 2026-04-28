package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AllowListDTO;

@Repository
public class AllowListDAOImpl extends BaseDAOImpl<AllowListDTO> implements AllowListDAOInt {

	@Override
	public Class<AllowListDTO> getDTOClass() {
		return AllowListDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(AllowListDTO dto, CriteriaBuilder builder, Root<AllowListDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAllowId())) {
			whereCondition.add(builder.like(qRoot.get("allowId"),dto.getAllowId() + "%"));
		}
		return whereCondition;
	}

}
