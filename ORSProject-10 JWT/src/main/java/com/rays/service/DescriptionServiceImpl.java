package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DescriptionDAOInt;
import com.rays.dto.DescriptionDTO;

@Service
@Transactional
public class DescriptionServiceImpl extends BaseServiceImpl<DescriptionDTO,DescriptionDAOInt> implements DescriptionServiceInt {

}
