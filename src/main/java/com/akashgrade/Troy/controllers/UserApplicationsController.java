package com.akashgrade.Troy.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akashgrade.Troy.models.UserApplications;
import com.akashgrade.Troy.services.UserApplicationsServiceImpl;


@Controller
@CrossOrigin
@RequestMapping("UserApplications")
public class UserApplicationsController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public UserApplicationsServiceImpl userApplicationsService;
	
	@Autowired
	public UserApplicationsController(UserApplicationsServiceImpl userApplicationsService) {
		this.userApplicationsService = userApplicationsService;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAppsByUser/{key}", produces = {"application/json"})
	@ResponseBody
	public UserApplications getAppsByUser(@PathVariable("key") final String key) {
		logger.info("UserController : getAppsByUser() called for key : "+key);
		return userApplicationsService.findApplicationsByUser(key);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/addAppforUser/{userId}/{appId}", consumes = {"application/json"})
	@ResponseBody
	public ResponseEntity<?> addAppforUser(@PathVariable("userId") final String userId, @PathVariable("appId") final String appId) {
		logger.info("UserController : addAppforUser() called for : "+ userId);
		boolean isAdded = userApplicationsService.addAppForUser(userId, appId);
		
		return isAdded? ResponseEntity.status(HttpStatus.CREATED).build():
			ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}
	
	

}
