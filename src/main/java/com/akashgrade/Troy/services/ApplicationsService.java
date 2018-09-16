package com.akashgrade.Troy.services;

import java.util.List;

import javax.validation.Valid;

import com.akashgrade.Troy.models.Applications;

public interface ApplicationsService {
	
	Applications findApplicationById(String id);
	boolean add(@Valid Applications application);
	boolean remove(Applications application);
	List<Applications> findByParentAppId(String parentAppId);
    List<Applications> findByOwnerId(String ownerId);
}
