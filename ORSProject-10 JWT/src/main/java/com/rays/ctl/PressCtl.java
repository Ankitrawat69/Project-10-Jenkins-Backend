package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PressDTO;
import com.rays.form.PressForm;
import com.rays.service.PressServiceInt;

@RestController
@RequestMapping(value = "Press")
public class PressCtl extends BaseCtl<PressForm, PressDTO, PressServiceInt> {

}
