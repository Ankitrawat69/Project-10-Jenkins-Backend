package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SchedulerJobDAOInt;
import com.rays.dto.SchedulerJobDTO;

@Service
@Transactional
public class SchedulerJobServiceImpl extends BaseServiceImpl<SchedulerJobDTO, SchedulerJobDAOInt> implements SchedulerJobServiceInt {

}
