package com.akashgrade.Troy.models;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.json.JSONObject;
import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Document
public class Applications {
	
	@Id
	@Field
	@NotNull
	private String applicationId;
	
	@Field
	@NotNull
	private String name;
	
	@Field
	@NotNull
	private String description;
	
	@Field
	@NotNull
	private JSONObject eventFormat;
	
	@Field
	private Rule alertNotificationRule;
	
	@Field
	private List<String> alertNotificationChannel;
	
	@Field
	private List<API> apiList;
	
	@Field
	private String parentAppId;
	
	@Field
	@NotNull
	private String ownerId;
	
	@Field
	private String createDate;
	
	@Field
	private String updateDate;
	
	@Field
	@NotNull
	private String activeFlag;

	
	
	public String getApplicationId() {
		return applicationId;
	}



	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	public JSONObject getEventFormat() {
		return eventFormat;
	}



	public void setEventFormat(JSONObject eventFormat) {
		this.eventFormat = eventFormat;
	}



	public Rule getAlertNotificationRule() {
		return alertNotificationRule;
	}



	public void setAlertNotificationRule(Rule alertNotificationRule) {
		this.alertNotificationRule = alertNotificationRule;
	}



	public List<String> getAlertNotificationChannel() {
		return alertNotificationChannel;
	}



	public void setAlertNotificationChannel(List<String> alertNotificationChannel) {
		this.alertNotificationChannel = alertNotificationChannel;
	}



	public List<API> getApiList() {
		return apiList;
	}



	public void setApiList(List<API> apiList) {
		this.apiList = apiList;
	}



	public String getParentAppId() {
		return parentAppId;
	}



	public void setParentAppId(String parentAppId) {
		this.parentAppId = parentAppId;
	}



	public String getOwnerId() {
		return ownerId;
	}



	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
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
		return "Appilications [applicationId=" + applicationId + ", name=" + name + ", description=" + description
				+ ", eventFormat=" + eventFormat + ", alertNotificationRule=" + alertNotificationRule
				+ ", alertNotificationChannel=" + alertNotificationChannel + ", apiList=" + apiList + ", parentAppId="
				+ parentAppId + ", ownerId=" + ownerId + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", activeFlag=" + activeFlag + "]";
	}
		

}
