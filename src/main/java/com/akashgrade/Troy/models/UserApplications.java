package com.akashgrade.Troy.models;

import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Document
public class UserApplications {
	
	@Id
	@Field
	@NotNull
	private String userId;
	
	@Field
	@NotNull
	private Set<String> listOfApps;

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Set<String> getListOfApps() {
		return listOfApps;
	}

	public void setListOfApps(Set<String> listOfApps) {
		this.listOfApps = listOfApps;
	}

	@Override
	public String toString() {
		return "UserApplications [userId=" + userId + ", listOfApps=" + listOfApps + "]";
	}
	

}
