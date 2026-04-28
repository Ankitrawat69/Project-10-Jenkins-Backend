package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SecretDAOInt;
import com.rays.dto.SecretDTO;

@Service
@Transactional
public class SecretServiceImpl extends BaseServiceImpl<SecretDTO, SecretDAOInt> implements SecretServiceInt{

}
