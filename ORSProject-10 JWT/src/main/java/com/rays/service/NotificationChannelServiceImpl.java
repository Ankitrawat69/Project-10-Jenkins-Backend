package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.NotificationChannelDAOInt;
import com.rays.dto.NotificationChannelDTO;

@Service
@Transactional
public class NotificationChannelServiceImpl extends BaseServiceImpl<NotificationChannelDTO, NotificationChannelDAOInt> implements NotificationChannelServiceInt {

}
