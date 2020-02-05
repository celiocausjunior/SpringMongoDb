package com.celiocausjr.SpringMongoDb.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celiocausjr.SpringMongoDb.domain.User;
import com.celiocausjr.SpringMongoDb.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();

	}

}
