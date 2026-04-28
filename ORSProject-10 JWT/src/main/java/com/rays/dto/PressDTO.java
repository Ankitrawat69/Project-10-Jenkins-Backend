package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_press")
public class PressDTO extends BaseDTO {
	
	@Column(name = "pressReleaseId", length = 50)
	private String pressReleaseId;
	
	@Column(name = "title", length = 50)
	private String title;
	
	@Column(name = "releaseDate", length = 50)
	private Date releaseDate;
	
	@Column(name = "author", length = 50)
	private String author;

	public String getPressReleaseId() {
		return pressReleaseId;
	}

	public void setPressReleaseId(String pressReleaseId) {
		this.pressReleaseId = pressReleaseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String getValue() {
		return pressReleaseId;
	}

	@Override
	public String getUniqueKey() {
		return "pressReleaseId";
	}

	@Override
	public String getUniqueValue() {
		return pressReleaseId;
	}

	@Override
	public String getLabel() {
		return "PressRelease Id";
	}

	@Override
	public String getTableName() {
		return "Press";
	}
	
	

}
