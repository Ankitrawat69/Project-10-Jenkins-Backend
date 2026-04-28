package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.GameDTO;

@Repository
public class GameDAOImpl extends BaseDAOImpl<GameDTO> implements GameDAOInt {

	@Override
	public Class<GameDTO> getDTOClass() {
		return GameDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(GameDTO dto, CriteriaBuilder builder, Root<GameDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPlayerName())) {
			whereCondition.add(builder.like(qRoot.get("playerName"), dto.getPlayerName() + "%"));
		}
		return whereCondition;
	}

}
