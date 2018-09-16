package com.akashgrade.Troy.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akashgrade.Troy.models.Users;
import com.akashgrade.Troy.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public List<Users> findByFirstName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}

	@Override
	public Users findUserById(String id) {
		Optional<Users> optionalObject = userRepository.findById(id);
		return optionalObject.isPresent() ? optionalObject.get() : null;
	}

	@Override
	public boolean add(@Valid Users user) {
		//String aUUID = UUID.randomUUID().toString();
		//user.setLastName(aUUID);
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean remove(Users user) {
		userRepository.delete(user);
		return true;
	}

	@Override
	public List<Users> findByActiveFlag(String firstName) {
		return userRepository.findByActiveFlag(firstName);
	}
	
}
