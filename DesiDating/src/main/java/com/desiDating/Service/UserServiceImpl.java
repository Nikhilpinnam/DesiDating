package com.desiDating.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desiDating.Repo.UserRepo;
import com.desiDating.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public Optional<User> getUserDetails(long UserId) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findById(UserId);
		return user;
	}

	@Override
	public User createUserDetails(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User updateUserDetails(User user, long UserId) {
		// TODO Auto-generated method stub
		Optional<User> userdetails = userRepo.findById(UserId);
		/* userRepo.save(userdetails); */
		return null;
	}

	@Override
	public void DeleteUserDetails(long UserId) {
		// TODO Auto-generated method stub

		userRepo.deleteById(UserId);

	}

}
