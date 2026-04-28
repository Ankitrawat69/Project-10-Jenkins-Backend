package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "st_description")
public class DescriptionDTO extends BaseDTO {
		
		@Column(name = "descriptionId", length = 50)
		private String descriptionId;
		
		@Column(name = "descriptionCode", length = 50)
		private String descriptionCode ;
		
		@Column(name = "algorithm", length = 50)
		private String algorithm ;
		
		@Column(name = "keyUsed", length = 50)
		private String keyUsed;

		@Column(name = "status", length = 50)
		private String status;

		public String getDescriptionId() {
			return descriptionId;
		}

		public void setDescriptionId(String descriptionId) {
			this.descriptionId = descriptionId;
		}

		public String getDescriptionCode() {
			return descriptionCode;
		}

		public void setDescriptionCode(String descriptionCode) {
			this.descriptionCode = descriptionCode;
		}

		public String getAlgorithm() {
			return algorithm;
		}

		public void setAlgorithm(String algorithm) {
			this.algorithm = algorithm;
		}

		public String getKeyUsed() {
			return keyUsed;
		}

		public void setKeyUsed(String keyUsed) {
			this.keyUsed = keyUsed;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String getValue() {
			return descriptionId;
		}

		@Override
		public String getUniqueKey() {
			return "descriptionId";
		}

		@Override
		public String getUniqueValue() {
			return descriptionId;
		}

		@Override
		public String getLabel() {
			return "Description Id";
		}

		@Override
		public String getTableName() {
			return "Description";
		}

	    
}
