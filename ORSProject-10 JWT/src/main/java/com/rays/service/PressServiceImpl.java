package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PressDAOInt;
import com.rays.dto.PressDTO;

@Service
@Transactional
public class PressServiceImpl extends BaseServiceImpl<PressDTO, PressDAOInt> implements PressServiceInt {

}
