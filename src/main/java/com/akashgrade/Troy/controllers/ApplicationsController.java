package com.akashgrade.Troy.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akashgrade.Troy.models.Applications;
import com.akashgrade.Troy.services.ApplicationsServiceImpl;


@Controller
@CrossOrigin
@RequestMapping("Applications")
public class ApplicationsController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public ApplicationsServiceImpl applicationService;
	
	@Autowired
	public ApplicationsController(ApplicationsServiceImpl applicationService) {
		this.applicationService = applicationService;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/getApplication/{key}", produces = {"application/json"})
	@ResponseBody
	public Applications getApplication(@PathVariable("key") final String key) {
		logger.info("ApplicationsController : getApplication() called for key : "+key);
		return applicationService.findApplicationById(key);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/addApplication", consumes = {"application/json"})
	@ResponseBody
	public ResponseEntity<?> addApplication(@RequestBody Applications application) {
		logger.info("ApplicationsController : addApplication() called for : "+ application);
		boolean isAdded = applicationService.add(application);
		
		return isAdded? ResponseEntity.status(HttpStatus.CREATED).build():
			ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}
	

}
