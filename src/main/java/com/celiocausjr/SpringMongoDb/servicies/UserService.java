package com.celiocausjr.SpringMongoDb.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celiocausjr.SpringMongoDb.domain.User;
import com.celiocausjr.SpringMongoDb.repositories.UserRepository;
import com.celiocausjr.SpringMongoDb.servicies.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();

	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
