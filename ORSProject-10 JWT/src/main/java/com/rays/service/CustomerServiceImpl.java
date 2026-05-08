package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CustomerDAOInt;
import com.rays.dto.CustomerDTO;

//Customer service

@Service
@Transactional
public class CustomerServiceImpl extends BaseServiceImpl<CustomerDTO, CustomerDAOInt> implements CustomerServiceInt{

}