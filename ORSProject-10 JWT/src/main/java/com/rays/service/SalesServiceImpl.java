package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SalesDAOInt;
import com.rays.dto.SalesDTO;

@Service
@Transactional
public class SalesServiceImpl extends BaseServiceImpl<SalesDTO,SalesDAOInt> implements SalesServiceInt{

}
