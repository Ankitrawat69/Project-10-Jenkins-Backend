package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SubscriptionUsageDTO;

@Repository
public class SubscriptionUsageDAOImpl extends BaseDAOImpl<SubscriptionUsageDTO> implements SubscriptionUsageDAOInt {

	@Override
	public Class<SubscriptionUsageDTO> getDTOClass() {
		return SubscriptionUsageDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SubscriptionUsageDTO dto, CriteriaBuilder builder,
			Root<SubscriptionUsageDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getUsageId())) {
			whereCondition.add(builder.like(qRoot.get("usageId"), dto.getUsageId() + "%"));
		}
		return whereCondition;
	}

}
	
		
