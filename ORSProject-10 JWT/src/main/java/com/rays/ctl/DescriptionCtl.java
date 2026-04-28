package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.DescriptionDTO;
import com.rays.form.DescriptionForm;
import com.rays.service.DescriptionServiceInt;

@RestController
@RequestMapping(value = "Description")
public class DescriptionCtl extends BaseCtl<DescriptionForm, DescriptionDTO, DescriptionServiceInt> {

}
