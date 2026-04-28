package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LockerDTO;
import com.rays.form.LockerForm;
import com.rays.service.LockerServiceInt;

@RestController
@RequestMapping(value = "Locker")
public class LockerCtl extends BaseCtl<LockerForm, LockerDTO, LockerServiceInt> {

}
