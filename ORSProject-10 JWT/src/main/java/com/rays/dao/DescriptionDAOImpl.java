package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DescriptionDTO;

@Repository
public class DescriptionDAOImpl extends BaseDAOImpl<DescriptionDTO> implements DescriptionDAOInt{

	@Override
	public Class<DescriptionDTO> getDTOClass() {
		return DescriptionDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DescriptionDTO dto, CriteriaBuilder builder, Root<DescriptionDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDescriptionId())) {
			whereCondition.add(builder.like(qRoot.get("descriptionId"), dto.getDescriptionId() + "%"));
		}
		return whereCondition;
	}

}
