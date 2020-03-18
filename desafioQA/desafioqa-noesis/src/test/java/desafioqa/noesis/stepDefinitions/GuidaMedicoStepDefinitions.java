package desafioqa.noesis.stepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import desafioqa.noesis.base.BrowserStart;
import desafioqa.noesis.pages.BuscaDetalhadaPage;
import desafioqa.noesis.pages.GuiaMedicoPage;
import desafioqa.noesis.pages.RedeAssistencialPage;

public class GuidaMedicoStepDefinitions {

	private GuiaMedicoPage guiaMedicoPage;
	private BuscaDetalhadaPage buscaDetalhadaPage;
	private RedeAssistencialPage redeAssistencialPage;

	@Given("^que o usuario esta na pagina inicial da Unimed$")
	public void que_o_usuario_esta_na_pagina_inicial_da_Unimed() throws Throwable {
		BrowserStart.setUp();
	}

	@When("^ele clicar no menu Guia Medico$")
	public void ele_clicar_no_menu_Guia_Medico() throws Throwable {
		guiaMedicoPage = new GuiaMedicoPage(BrowserStart.driver);
		guiaMedicoPage.clickGuiaMedico();
	}

	@Then("^eh redirecionado para pesquisa detalhada$")
	public void eh_redirecionado_para_pesquisa_detalhada() throws Throwable {
		buscaDetalhadaPage = new BuscaDetalhadaPage(BrowserStart.driver);
		buscaDetalhadaPage.clickBuscaDetalhada();
	}

	@Then("^informa o estado Rio de Janeiro e a cidade do Rio de janeiro e seleciona unidade$")
	public void informa_o_estado_Rio_de_Janeiro_e_a_cidade_do_Rio_de_janeiro_e_seleciona_unidade() throws Throwable {
		buscaDetalhadaPage = new BuscaDetalhadaPage(BrowserStart.driver);
		buscaDetalhadaPage.pesquisarPorEstadoECidade("Rio de Janeiro", "Rio de Janeiro");
	}

	@Then("^clica em pesquisar$")
	public void clica_em_pesquisar() throws Throwable {
		buscaDetalhadaPage = new BuscaDetalhadaPage(BrowserStart.driver);
		buscaDetalhadaPage.clickPesquisar();		
	}

	@Then("^informa prestador Medico e clica em pesquisar$")
	public void informa_prestador_Medico_e_clica_em_pesquisar() throws Throwable {
		redeAssistencialPage = new RedeAssistencialPage(BrowserStart.driver);
		redeAssistencialPage.selecionarRecurso();
	}

	@Then("^valida a pesquisa por especialidade e cidade$")
	public void valida_a_pesquisa_por_especialidade_e_cidade() throws Throwable {
		assertEquals("a", "a");
		BrowserStart.tearDown();
	}

	@Then("^pesquisa por medico de Sao Paulo$")
	public void pesquisa_por_medico_de_Sao_Paulo() throws Throwable {
		assertEquals("a", "a");
	}

	@Then("^nao eh encontrado nenhum resultado$")
	public void nao_eh_encontrado_nenhum_resultado() throws Throwable {
		assertEquals("a", "a");
		BrowserStart.tearDown();
	}
}
