package com.calcme.service;

import java.util.List;

import com.calcme.entities.User;

public interface UserService {

	public List<User> get_All();

	public User save(User user);
}
