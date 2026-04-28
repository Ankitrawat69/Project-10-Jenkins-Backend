package com.rays.form;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MediaCoverageDTO;

public class MediaCoverageForm extends BaseForm {
	
	@NotEmpty(message = "mediaCoverageId is required")
    private String mediaCoverageId;
	
	@NotEmpty(message = "mediaName is required")
	private String mediaName;
	
	@NotNull(message = "coverageDate is required")
	private Date coverageDate;
	
	@NotEmpty(message = "reporter is required")
	private String reporter;

	public String getMediaCoverageId() {
		return mediaCoverageId;
	}

	public void setMediaCoverageId(String mediaCoverageId) {
		this.mediaCoverageId = mediaCoverageId;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public Date getCoverageDate() {
		return coverageDate;
	}

	public void setCoverageDate(Date coverageDate) {
		this.coverageDate = coverageDate;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	
	@Override
	public BaseDTO getDto() {
		
		MediaCoverageDTO dto = initDTO(new MediaCoverageDTO());
		                 dto.setMediaCoverageId(mediaCoverageId);
		                 dto.setMediaName(mediaName);
		                 dto.setCoverageDate(coverageDate);
		                 dto.setReporter(reporter);
		          return dto;
	}
}
