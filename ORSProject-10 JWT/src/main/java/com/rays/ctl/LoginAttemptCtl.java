package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LoginAttemptDTO;
import com.rays.form.LoginAttemptForm;
import com.rays.service.LoginAttemptServiceInt;

@RestController
@RequestMapping(value = "LoginAttempt")
public class LoginAttemptCtl extends BaseCtl<LoginAttemptForm, LoginAttemptDTO, LoginAttemptServiceInt> {

}
