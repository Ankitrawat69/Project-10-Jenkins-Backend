package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.AccountDTO;
import com.rays.form.AccountForm;
import com.rays.service.AccountServiceInt;

@RestController
@RequestMapping(value = "Account")
public class AccountCtl extends BaseCtl<AccountForm, AccountDTO, AccountServiceInt> {

}
