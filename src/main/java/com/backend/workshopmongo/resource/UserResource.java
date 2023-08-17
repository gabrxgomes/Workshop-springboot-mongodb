package com.backend.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.workshopmongo.domain.User;

@RestController //diz que a nossa classe é um recurso rest
@RequestMapping(value = "/users") //aqui damos o caminho do endpoint
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET) //o metodo get é para obter informações no metodo rest O GETMAPPING
	//funciona igual
	public List<User> findAll(){
		
		//fazendo um teste para saber se estamos 
		//instanciando o objeto corretamente com seus atributos
		
		User maria = new User("1", "Maria Brown", "mariabrown@gmail.com");
		User jones = new User("2", "Jones Green", "jonesgreen@gmail.com");
		List<User> list = new ArrayList<>(); //definindo o obj da lista
		
		list.addAll(Arrays.asList(maria, jones)); //adicionando esses valores de teste direto
		//no nosso objeto da list "List<User> list
		
		return list;
		
	}

}
