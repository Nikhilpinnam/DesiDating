package com.desiDating.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.desiDating.Exceptions.UserDetailsNotFoundException;
import com.desiDating.Service.UserService;
import com.desiDating.entity.User;

@RestController
@RequestMapping("/userAccount")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@GetMapping(value = "/getUserDetails")
	public Optional<User> getUserDetails(@PathVariable long UserId) {
		/*
		 * if (UserId == null || " ".isEqual(UserId)) { throw new
		 * UserDetailsNotFoundException("User Details not Found exception" + UserId); }
		 * else
		 */
		logger.info("Get User Details with UserId :" + UserId);

		return userService.getUserDetails(UserId);

	}

	@PostMapping(value = "/createUserDetails")
	public User createUserDetails(@RequestBody User user) {

		logger.info("Get User Details with UserId :" + user.getUserId());

		return userService.createUserDetails(user);

	}

	public void deleteUserDetails(@PathVariable long UserId) {

		logger.info("Delete User Details with UserId :" + UserId);

		userService.DeleteUserDetails(UserId);

	}

}
