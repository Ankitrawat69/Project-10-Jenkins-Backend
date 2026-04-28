package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InternetPackageDTO;

@Repository
public class InternetPackageDAOImpl extends BaseDAOImpl<InternetPackageDTO> implements InternetPackageDAOInt {

	@Override
	public Class<InternetPackageDTO> getDTOClass() {
		return InternetPackageDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(InternetPackageDTO dto, CriteriaBuilder builder,
			Root<InternetPackageDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPackageId())) {
			whereCondition.add(builder.like(qRoot.get("packageId"),dto.getPackageId() + "%"));
		}
		return whereCondition;
	}

}
