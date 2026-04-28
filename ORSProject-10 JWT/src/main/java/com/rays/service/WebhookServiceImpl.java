package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.WebhookDAOInt;
import com.rays.dto.WebhookDTO;

@Service
@Transactional
public class WebhookServiceImpl extends BaseServiceImpl<WebhookDTO, WebhookDAOInt> implements WebhookServiceInt {

}
