package br.com.fatec.projeto.api.entity;

public class User {
	
	public static final String TABLE = "PROJ_USER";
	public static final String COL_ID= "ID";
	public static final String COL_NAME = "NAME";
	public static final String COL_LOGIN = "LOGIN";
	public static final String COL_PASSWORD = "PASSWORD";
	
	private Long id;
	private String name;
	private String login;
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
