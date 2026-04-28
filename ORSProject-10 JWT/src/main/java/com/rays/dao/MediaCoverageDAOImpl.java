package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MediaCoverageDTO;

@Repository
public class MediaCoverageDAOImpl extends BaseDAOImpl<MediaCoverageDTO> implements MediaCoverageDAOInt {

	@Override
	public Class<MediaCoverageDTO> getDTOClass() {
		return MediaCoverageDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(MediaCoverageDTO dto, CriteriaBuilder builder,
			Root<MediaCoverageDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getMediaCoverageId())) {
			whereCondition.add(builder.like(qRoot.get("mediaCoverageId"), dto.getMediaCoverageId() + "%"));
		}
		return whereCondition;
	}

}
