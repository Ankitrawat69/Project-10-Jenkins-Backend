package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AccountDTO;

@Repository
public class AccountDAOImpl extends BaseDAOImpl<AccountDTO> implements AccountDAOInt {

	@Override
	public Class<AccountDTO> getDTOClass() {
		return AccountDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(AccountDTO dto, CriteriaBuilder builder, Root<AccountDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAccountId())) {
			whereCondition.add(builder.like(qRoot.get("accountId"),dto.getAccountId() + "%"));
		}
		return whereCondition;
	}

}

