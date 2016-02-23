package br.com.fatec.projeto.api.dao;

import java.util.List;

import br.com.fatec.projeto.api.entity.User;

public interface UserDAO {
	
	Long save (User user);
	
	void update (User user);
	
	void delete (Long id);
	
	User findbyId (Long id);
	
	List <User> findAll();
	
}
