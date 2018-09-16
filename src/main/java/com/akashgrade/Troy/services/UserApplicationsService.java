package com.akashgrade.Troy.services;

import com.akashgrade.Troy.models.UserApplications;

public interface UserApplicationsService {
	UserApplications findApplicationsByUser(String userId);
	boolean addAppForUser(String userId, String appId);
}
