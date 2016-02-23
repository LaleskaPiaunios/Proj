package br.com.fatec.projeto.test.dao;

import org.junit.Before;
import org.junit.Test;

import br.com.fatec.projeto.api.dao.UserDAO;
import br.com.fatec.projeto.api.entity.User;
import br.com.fatec.projeto.test.commons.TestBase;
import br.com.spektro.minispring.core.implfinder.ImplFinder;

public class UsuarioDAOTest extends TestBase{
	
	private UserDAO dao;
	
	@Before
	public void config(){
		this.dao = ImplFinder.getImpl(UserDAO.class);
	}
	
	
	@Test
	public void test() {
		System.out.println("OK!");
	}
	
	@Test
	public void save() {
		
		User u = new User();
		u.setName("a");
		u.setLogin("b");
		u.setPassword("c");
		
		
	}
	
	
	@Test
	public void update() {
	}
	
	@Test
	public void delete(){
		
	}
	
	@Test
	public void findAll(){
		
	}
	
	@Test
	public void findbyId(){
		
	}

}
