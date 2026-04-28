package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AllowListDAOInt;
import com.rays.dto.AllowListDTO;

@Service
@Transactional
public class AllowListServiceImpl extends BaseServiceImpl<AllowListDTO,AllowListDAOInt> implements AllowListServiceInt {

}
