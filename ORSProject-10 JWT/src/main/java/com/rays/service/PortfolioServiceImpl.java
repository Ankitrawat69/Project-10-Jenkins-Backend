package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PortfolioDAOInt;
import com.rays.dto.PortfolioDTO;

@Service
@Transactional
public class PortfolioServiceImpl extends BaseServiceImpl<PortfolioDTO,PortfolioDAOInt> implements PortfolioServiceInt{

}
