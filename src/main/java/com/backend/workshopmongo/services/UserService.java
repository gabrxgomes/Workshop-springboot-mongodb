package com.backend.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.workshopmongo.domain.User;
import com.backend.workshopmongo.repository.UserRepository;

/*Agora para eu falar para o spring que essa classe vai ser um serviço que poderá ser injetado
 * em outra classe eu uso o @Service*/

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}

}
