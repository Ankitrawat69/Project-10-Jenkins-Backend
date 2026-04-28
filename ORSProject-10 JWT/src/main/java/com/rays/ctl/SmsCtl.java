package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SmsDTO;
import com.rays.form.SmsForm;
import com.rays.service.SmsServiceInt;

@RestController
@RequestMapping(value = "Sms")
public class SmsCtl extends BaseCtl<SmsForm, SmsDTO, SmsServiceInt> {

}
