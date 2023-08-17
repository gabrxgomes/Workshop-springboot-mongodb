package com.backend.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.backend.workshopmongo.domain.User;

/*agora implementamos o repository usando o springdata*/
/*CTRL + ESPAÇO DA AUTO COMPLETE*/

/*Aqui usamos o mongo repository que recebe como parametro qual a classe que sera mapeada
 * e o tipo de dado, como queremos implementar a classe user e o tipo de dado do id dela é texto
 * os colocamos assim*/

/*o mongo repository ja vem com varias funções onde podemos salvar, deletar e alterar qualquer coisa relacionada ao nosso
 * usuario*/
@Repository
public interface UserRepository extends MongoRepository<User, String>{
	

}
