package com.backend.workshopmongo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.workshopmongo.domain.User;
import com.backend.workshopmongo.services.UserService;

@RestController // diz que a nossa classe é um recurso rest
@RequestMapping(value = "/users") // aqui damos o caminho do endpoint
public class UserResource {
	
	@Autowired
	private UserService service;
	
	
	@RequestMapping(method = RequestMethod.GET) // o metodo get é para obter informações no metodo rest O GETMAPPING
	// funciona igual

	/*
	 * public List<User> findAll(){
	 * 
	 * //fazendo um teste para saber se estamos //instanciando o objeto corretamente
	 * com seus atributos
	 * 
	 * User maria = new User("1", "Maria Brown", "mariabrown@gmail.com"); User jones
	 * = new User("2", "Jones Green", "jonesgreen@gmail.com"); List<User> list = new
	 * ArrayList<>(); //definindo o obj da lista
	 * 
	 * list.addAll(Arrays.asList(maria, jones)); //adicionando esses valores de
	 * teste direto //no nosso objeto da list "List<User> list
	 * 
	 * return list;
	 * 
	 */ //isso é um retorno de lista mto basico

	public ResponseEntity<List<User>>  findAll() {
		/* aqui usaremos um obj mais sofisticado no java , ele vai encapsular
		 * toda uma estrutura necessaria para a gente retornar respostas HTTP com cabeçalho
		 * possiveis erros e td mais */
		
		

		// fazendo um teste para saber se estamos
		// instanciando o objeto corretamente com seus atributos

		//User maria = new User("1", "Maria Brown", "mariabrown@gmail.com");
		//User jones = new User("2", "Jones Green", "jonesgreen@gmail.com");
		List<User> list = service.findAll();//new ArrayList<>(); // definindo o obj da lista

		//list.addAll(Arrays.asList(maria, jones)); // adicionando esses valores de teste direto
		// no nosso objeto da list "List<User> list

		return ResponseEntity.ok().body(list);
		/* o "ok" vai instanciar o nosso ResponseEntity com o codigo de resposta http que a resposta
		 * ocorreu corretamente, e o body vai ser o corpo da resposta*/

	}

}
