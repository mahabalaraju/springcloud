package com.raj.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.repository.userDao;

@Service
public class userService {

	@Autowired
	private userDao userdao;

	public String getUserIdByUsername(String name) {
		System.out.print("UserService Called");
		return userdao.getUserId(name);
	}
}
