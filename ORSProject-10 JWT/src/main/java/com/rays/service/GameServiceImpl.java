package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GameDAOInt;
import com.rays.dto.GameDTO;

@Service
@Transactional
public class GameServiceImpl extends BaseServiceImpl<GameDTO,GameDAOInt> implements GameServiceInt {

}
