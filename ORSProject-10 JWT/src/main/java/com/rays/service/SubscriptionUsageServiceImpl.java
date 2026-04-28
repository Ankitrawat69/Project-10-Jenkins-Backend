package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SubscriptionUsageDAOInt;
import com.rays.dto.SubscriptionUsageDTO;

@Service
@Transactional
public class SubscriptionUsageServiceImpl extends BaseServiceImpl<SubscriptionUsageDTO, SubscriptionUsageDAOInt> implements SubscriptionUsageServiceInt {

}
