package br.com.fatec.projeto.api.entity;

public class GroupPaper {
	
	public static final String TABLE  = "PROJ_GROUP_PAPER";
	public static final String COL_ID = "PROJ_ID";
	public static final String COL_DESCRIPTION = "PROJ_DESCRIPTION";
	
	private Long id;
	private String name;
	private String description;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}