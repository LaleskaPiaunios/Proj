package br.com.fatec.projeto.test.commons;
import org.junit.BeforeClass;

import br.com.spektro.minispring.core.dbmapper.ConfigDBMapper;
import br.com.spektro.minispring.core.implfinder.ContextSpecifier;
import br.com.spektro.minispring.core.liquibaseRunner.LiquibaseRunnerService;

public class TestBase {

	@BeforeClass
	public static void setUp() {
		ContextSpecifier.setContext("br.com.fatec.projeto"); //setar o contexto da classe base
		ConfigDBMapper.setDefaultConnectionName("test"); //nome da configuração default
		LiquibaseRunnerService.run(); // Acha o changlog-master e executa a API do Liquibase
	}

}
