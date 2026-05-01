package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CacheModuleDTO;
import com.rays.form.CacheModuleForm;
import com.rays.service.CacheModuleServiceInt;

@RestController
@RequestMapping(value = "Cache")
public class CacheModuleCtl extends BaseCtl<CacheModuleForm, CacheModuleDTO, CacheModuleServiceInt> {

}
