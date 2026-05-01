package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CacheModuleDTO;

@Repository
public class CacheModuleDAOImpl extends BaseDAOImpl<CacheModuleDTO> implements CacheModuleDAOInt {

	@Override
	public Class<CacheModuleDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return CacheModuleDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CacheModuleDTO dto, CriteriaBuilder builder, Root<CacheModuleDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCacheId())) {
			whereCondition.add(builder.like(qRoot.get("cacheId"),dto.getCacheId() + "%"));
		}
		return whereCondition;
	}

}
