package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.RuleEngineDTO;
import com.rays.form.RuleEngineForm;
import com.rays.service.RuleEngineServiceInt;

@RestController
@RequestMapping(value = "RuleEngine")
public class RuleEngineCtl extends BaseCtl<RuleEngineForm, RuleEngineDTO, RuleEngineServiceInt> {

}
