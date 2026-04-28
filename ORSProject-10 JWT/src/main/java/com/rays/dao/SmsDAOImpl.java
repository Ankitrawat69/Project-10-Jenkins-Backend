package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SmsDTO;

@Repository
public class SmsDAOImpl extends BaseDAOImpl<SmsDTO> implements SmsDAOInt{

	@Override
	public Class<SmsDTO> getDTOClass() {
		return SmsDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SmsDTO dto, CriteriaBuilder builder, Root<SmsDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSmsId())) {
			whereCondition.add(builder.like(qRoot.get("smsId"), dto.getSmsId() + "%"));
		}
		return whereCondition;
	}

}
