package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.MediaCoverageDTO;
import com.rays.form.MediaCoverageForm;
import com.rays.service.MediaCoverageServiceInt;

@RestController
@RequestMapping(value = "MediaCoverage")
public class MediaCoverageCtl extends BaseCtl<MediaCoverageForm, MediaCoverageDTO, MediaCoverageServiceInt> {

}
