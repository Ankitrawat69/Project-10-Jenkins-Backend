package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SmsDAOInt;
import com.rays.dto.SmsDTO;

@Service
@Transactional
public class SmsServiceImpl extends BaseServiceImpl<SmsDTO, SmsDAOInt> implements SmsServiceInt {

}
