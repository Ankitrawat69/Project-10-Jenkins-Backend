package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PipelineDTO;
import com.rays.form.PipelineForm;
import com.rays.service.PipelineServiceInt;

@RestController
@RequestMapping(value = "Pipeline")
public class PipelineCtl extends BaseCtl<PipelineForm, PipelineDTO,PipelineServiceInt> {

}
