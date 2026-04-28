package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RuleEngineDAOInt;
import com.rays.dto.RuleEngineDTO;

@Service
@Transactional
public class RuleEngineServiceImpl extends BaseServiceImpl<RuleEngineDTO, RuleEngineDAOInt> implements RuleEngineServiceInt  {

}
