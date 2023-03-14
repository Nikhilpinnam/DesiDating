package com.desiDating.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.desiDating.entity.User;

@Repository
public interface UserRepo extends MongoRepository<User, Long> {

}
