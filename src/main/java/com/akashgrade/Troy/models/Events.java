package com.akashgrade.Troy.models;

import javax.validation.constraints.NotNull;

import org.json.JSONObject;
import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Document
public class Events {
	
	@Id
	@Field
	@NotNull
	private String eventId;
	
	@Field
	@NotNull
	private String appId;
	
	@Field
	@NotNull
	private String hostName;
	
	@Field
	@NotNull
	private String eventTime;
	
	@Field
	@NotNull
	private JSONObject message;
	
	@Field
	private String alertFlag;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public JSONObject getMessage() {
		return message;
	}

	public void setMessage(JSONObject message) {
		this.message = message;
	}

	public String getAlertFlag() {
		return alertFlag;
	}

	public void setAlertFlag(String alertFlag) {
		this.alertFlag = alertFlag;
	}

	@Override
	public String toString() {
		return "Events [eventId=" + eventId + ", appId=" + appId + ", hostName=" + hostName + ", eventTime=" + eventTime
				+ ", message=" + message + ", alertFlag=" + alertFlag + "]";
	}


	
}
