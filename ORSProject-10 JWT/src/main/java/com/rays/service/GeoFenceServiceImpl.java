package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GeoFenceDAOInt;
import com.rays.dto.GeoFenceDTO;

@Service
@Transactional
public class GeoFenceServiceImpl extends BaseServiceImpl<GeoFenceDTO, GeoFenceDAOInt> implements GeoFenceServiceInt {

}
