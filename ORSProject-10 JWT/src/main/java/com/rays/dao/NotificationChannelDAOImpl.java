package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.NotificationChannelDTO;

@Repository
public class NotificationChannelDAOImpl extends BaseDAOImpl<NotificationChannelDTO> implements NotificationChannelDAOInt {

	@Override
	public Class<NotificationChannelDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return NotificationChannelDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(NotificationChannelDTO dto, CriteriaBuilder builder,
			Root<NotificationChannelDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getChannelId())) {
			whereCondition.add(builder.like(qRoot.get("channelId"),dto.getChannelId() + "%"));
		}
		return whereCondition;
	}

}