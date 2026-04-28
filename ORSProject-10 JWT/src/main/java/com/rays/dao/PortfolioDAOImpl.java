package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PortfolioDTO;

@Repository
public class PortfolioDAOImpl extends BaseDAOImpl<PortfolioDTO> implements PortfolioDAOInt{

	@Override
	public Class<PortfolioDTO> getDTOClass() {
		return PortfolioDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(PortfolioDTO dto, CriteriaBuilder builder, Root<PortfolioDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPortfolioId())) {
			whereCondition.add(builder.like(qRoot.get("portfolioId"), dto.getPortfolioId() + "%"));
		}
		return whereCondition;
	}

}
