package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.GameDTO;
import com.rays.form.GameForm;
import com.rays.service.GameServiceInt;

@RestController
@RequestMapping(value = "Game")
public class GameCtl extends BaseCtl<GameForm, GameDTO, GameServiceInt> {

}
