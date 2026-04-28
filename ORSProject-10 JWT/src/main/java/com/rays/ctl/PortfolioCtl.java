package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PortfolioDTO;
import com.rays.form.PortfolioForm;
import com.rays.service.PortfolioServiceInt;

@RestController
@RequestMapping(value = "Portfolio")
public class PortfolioCtl extends BaseCtl<PortfolioForm, PortfolioDTO, PortfolioServiceInt> {

}
