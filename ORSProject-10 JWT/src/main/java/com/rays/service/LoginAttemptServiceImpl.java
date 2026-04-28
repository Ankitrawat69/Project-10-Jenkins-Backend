package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LoginAttemptDAOInt;
import com.rays.dto.LoginAttemptDTO;

@Service
@Transactional
public class LoginAttemptServiceImpl extends BaseServiceImpl<LoginAttemptDTO,LoginAttemptDAOInt> implements LoginAttemptServiceInt {

}
