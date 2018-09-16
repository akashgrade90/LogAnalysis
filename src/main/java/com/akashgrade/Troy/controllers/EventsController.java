//package com.akashgrade.Troy.controllers;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.akashgrade.Troy.models.Users;
//import com.akashgrade.Troy.services.UserServiceImpl;
//
//
//@Controller
//@CrossOrigin
//@RequestMapping("UserMeta")
//public class EventsController {
//	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
//	public UserServiceImpl userService;
//	
//	@Autowired
//	public EventsController(UserServiceImpl userService) {
//		this.userService = userService;
//	}
//	
//	
//	@RequestMapping(method = RequestMethod.GET, value = "/getUser/{key}", produces = {"application/json"})
//	@ResponseBody
//	public Users getUser(@PathVariable("key") final String key) {
//		logger.info("UserController : getUser() called for key : "+key);
//		return userService.findUserById(key);
//	}
//	
//	
//	@RequestMapping(method = RequestMethod.POST, value = "/addUser", consumes = {"application/json"})
//	@ResponseBody
//	public ResponseEntity<?> addUser(@RequestBody Users user) {
//		logger.info("UserController : addUser() called for : "+ user);
//		boolean isAdded = userService.add(user);
//		
//		return isAdded? ResponseEntity.status(HttpStatus.CREATED).build():
//			ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
//	}
//	
//
//}
