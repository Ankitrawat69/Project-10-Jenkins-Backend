package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.MediaCoverageDAOInt;
import com.rays.dto.MediaCoverageDTO;

@Service
@Transactional
public class MediaCoverageServiceImpl extends BaseServiceImpl<MediaCoverageDTO, MediaCoverageDAOInt> implements MediaCoverageServiceInt {

}
