package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.InternetPackageDAOInt;
import com.rays.dto.InternetPackageDTO;

@Service
@Transactional
public class InternetPackageServiceImpl extends BaseServiceImpl<InternetPackageDTO, InternetPackageDAOInt> implements InternetPackageServiceInt{

}
