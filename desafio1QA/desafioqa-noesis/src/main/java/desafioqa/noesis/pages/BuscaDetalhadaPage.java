package desafioqa.noesis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import desafioqa.noesis.utils.SeleniumInteracts;

public class BuscaDetalhadaPage {
	@FindBy(linkText = "Busca detalhada")
	public WebElement opcaoBuscaDetalhada;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/div/div/div/div/div/div/div/div/div/div/div/div/div[1]/form/div/div[1]/div/div/div[2]/div[2]")
	public WebElement opcaoEstado;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div/div[1]/form/div/div[2]/div/div/div[1]")
	public WebElement opcaoCidade;
	
	@FindBy(css = "input[type=radio]")
	public WebElement unidadeUnimed;
	
	@FindBy(css = ".btn-success")
	public WebElement btnAcessar;

	public BuscaDetalhadaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickBuscaDetalhada() {
		SeleniumInteracts.clickButton(opcaoBuscaDetalhada);;
	}
	
	public void pesquisarPorEstadoECidade(String estado, String cidade) {
		SeleniumInteracts.insertText(opcaoEstado, estado);
		SeleniumInteracts.insertText(opcaoCidade, cidade);
		SeleniumInteracts.clickButton(unidadeUnimed);		
	}
	
	public void clickPesquisar() {
		SeleniumInteracts.clickButton(btnAcessar);	
	}
}
