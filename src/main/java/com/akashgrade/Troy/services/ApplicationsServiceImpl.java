package com.akashgrade.Troy.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akashgrade.Troy.models.Applications;
import com.akashgrade.Troy.repositories.ApplicationsRepository;

@Service
public class ApplicationsServiceImpl implements ApplicationsService {
	
	@Autowired
	private ApplicationsRepository applicationsRepository;
	
	@Autowired
	private UserApplicationsServiceImpl userApplicationsService;
	

	@Override
	public boolean add(@Valid Applications application) {
		
		Applications app = applicationsRepository.save(application);
		if (app != null) {
			userApplicationsService.addAppForUser(app.getOwnerId(), app.getApplicationId());
		}
		
		return true;
	}

	@Override
	public boolean remove(Applications application) {
		applicationsRepository.delete(application);
		return true;
	}

	@Override
	public Applications findApplicationById(String id) {
		Optional<Applications> optionalObject = applicationsRepository.findById(id);
		return optionalObject.isPresent() ? optionalObject.get() : null;
	}

	@Override
	public List<Applications> findByParentAppId(String parentAppId) {
		return applicationsRepository.findByParentAppId(parentAppId);
	}

	@Override
	public List<Applications> findByOwnerId(String ownerId) {
		return applicationsRepository.findByOwnerId(ownerId);
	}
	
}
