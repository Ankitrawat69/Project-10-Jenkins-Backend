package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.StateDTO;
import com.rays.form.StateForm;
import com.rays.service.StateServiceInt;

@RestController
@RequestMapping(value = "State")
public class StateCtl extends BaseCtl<StateForm, StateDTO, StateServiceInt> {

}
