package com.akashgrade.Troy.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akashgrade.Troy.models.UserApplications;
import com.akashgrade.Troy.repositories.UserAppsRepository;

@Service
public class UserApplicationsServiceImpl implements UserApplicationsService {

	@Autowired
	private UserAppsRepository userAppsRepository;


	@Override
	public UserApplications findApplicationsByUser(String userId) {
		Optional<UserApplications> optionalObject = userAppsRepository.findById(userId);
		return optionalObject.isPresent() ? optionalObject.get() : null;
	}

	@Override
	public boolean addAppForUser(String userId, String appId) {
		
		UserApplications userApplications = this.findApplicationsByUser(userId);
		
		if (userApplications == null) {
			UserApplications newUserApplications = new UserApplications();
			
			newUserApplications.setUserId(userId);
			

		    Set<String> applicationList = new HashSet<String>();
			applicationList.add(appId);
			newUserApplications.setListOfApps(applicationList);
			
			userAppsRepository.save(newUserApplications);
			
		}
		else {
			Set<String> applicationList = userApplications.getListOfApps();
			applicationList.add(appId);
			
			userApplications.setListOfApps(applicationList);
			
			userAppsRepository.save(userApplications);
		}
		return true;
	}
}
