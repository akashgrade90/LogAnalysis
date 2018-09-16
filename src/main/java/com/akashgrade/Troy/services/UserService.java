package com.akashgrade.Troy.services;

import java.util.List;

import javax.validation.Valid;

import com.akashgrade.Troy.models.Users;

public interface UserService {
	List<Users> findByFirstName(String firstName);
	List<Users> findByActiveFlag(String firstName);
	Users findUserById(String id);
	boolean add(@Valid Users user);
	boolean remove(Users user);
}
