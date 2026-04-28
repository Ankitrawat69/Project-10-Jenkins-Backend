package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_mediaCoverage")
public class MediaCoverageDTO extends BaseDTO {
	
	@Column(name = "mediaCoverageId", length = 50)
	private String mediaCoverageId;
	
	@Column(name = "mediaName", length = 50)
	private String mediaName;
	
	@Column(name = "coverageDate", length = 50)
	private Date coverageDate;
	
	@Column(name = "reporter", length = 50)
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
	public String getValue() {
		return mediaCoverageId;
	}

	@Override
	public String getUniqueKey() {
		return "mediaCoverageId";
	}

	@Override
	public String getUniqueValue() {
		return mediaCoverageId;
	}

	@Override
	public String getLabel() {
		return "Media CoverageId";
	}

	@Override
	public String getTableName() {
		return "Media Coverage";
	}
	
	

}
