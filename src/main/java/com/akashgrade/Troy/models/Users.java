package com.akashgrade.Troy.models;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Document
public class Users {
	
	@Id
	@Field
	@NotNull
	private String userId;
	
	@Field
	@NotNull
	private String firstName;
	
	@Field
	@NotNull
	private String lastName;
	
	@Field
	@NotNull
	private String adsId;
	
	@Field
	@NotNull
	private String emailId;
	
	@Field
	private String slackUserId;
	
	@Field
	private String createDate;
	
	@Field
	private String updateDate;
	
	@Field
	@NotNull
	private String activeFlag;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAdsId() {
		return adsId;
	}

	public void setAdsId(String adsId) {
		this.adsId = adsId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSlackUserId() {
		return slackUserId;
	}

	public void setSlackUserId(String slackUserId) {
		this.slackUserId = slackUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", adsId=" + adsId
				+ ", emailId=" + emailId + ", slackUserId=" + slackUserId + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", activeFlag=" + activeFlag + "]";
	}
	

}
