package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SalesDTO;
import com.rays.form.SalesForm;
import com.rays.service.SalesServiceInt;

@RestController
@RequestMapping(value = "Sales")
public class SalesCtl extends BaseCtl<SalesForm, SalesDTO, SalesServiceInt> {

}
