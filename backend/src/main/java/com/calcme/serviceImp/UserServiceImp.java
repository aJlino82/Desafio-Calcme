package com.calcme.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calcme.entities.User;
import com.calcme.repositories.UserRepository;
import com.calcme.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> get_All() {
		return this.userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return this.userRepository.save(user);
	}

}
