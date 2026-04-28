package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PressDTO;

@Repository
public class PressDAOImpl extends BaseDAOImpl<PressDTO> implements PressDAOInt {

	@Override
	public Class<PressDTO> getDTOClass() {
		return PressDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PressDTO dto, CriteriaBuilder builder, Root<PressDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPressReleaseId())) {
			whereCondition.add(builder.like(qRoot.get("pressReleaseId"), dto.getPressReleaseId() + "%"));
		}
		return whereCondition;
	}

}
