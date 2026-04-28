package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.WebhookDTO;

@Repository
public class WebhookDAOImpl extends BaseDAOImpl<WebhookDTO> implements WebhookDAOInt {

	@Override
	public Class<WebhookDTO> getDTOClass() {
		return WebhookDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(WebhookDTO dto, CriteriaBuilder builder, Root<WebhookDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getWebhookId())) {
			whereCondition.add(builder.like(qRoot.get("webhookId"), dto.getWebhookId() + "%"));
		}
		return whereCondition;
	}

}
