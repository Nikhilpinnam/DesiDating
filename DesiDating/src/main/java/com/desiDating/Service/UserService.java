package com.desiDating.Service;

import java.util.Optional;

import com.desiDating.entity.User;

public interface UserService {
	
	
	public Optional<User> getUserDetails(long UserId);
	
	public User createUserDetails(User user);
	
	public User updateUserDetails(User user, long UserId);
	
	public void DeleteUserDetails(long UserId);

}
