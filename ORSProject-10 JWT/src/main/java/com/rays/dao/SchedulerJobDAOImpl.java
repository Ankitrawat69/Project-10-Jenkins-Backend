package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SchedulerJobDTO;

@Repository
public class SchedulerJobDAOImpl extends BaseDAOImpl<SchedulerJobDTO> implements SchedulerJobDAOInt {

	@Override
	public Class<SchedulerJobDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return SchedulerJobDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SchedulerJobDTO dto, CriteriaBuilder builder,
			Root<SchedulerJobDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getJobId())) {
			whereCondition.add(builder.like(qRoot.get("jobId"), dto.getJobId() + "%"));
		}
		return whereCondition;
	}

}