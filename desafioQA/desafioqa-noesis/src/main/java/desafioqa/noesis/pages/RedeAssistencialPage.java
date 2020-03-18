package desafioqa.noesis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import desafioqa.noesis.utils.SeleniumInteracts;

public class RedeAssistencialPage {
	
	@FindBy(xpath = "//*[@id=\"campo_recurso\"]/div/div/div[1]")
	WebElement tipoRecurso;
	
	@FindBy(id = "btn_pesquisar")
	WebElement btnPesquisar;
	
	public RedeAssistencialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selecionarRecurso() {
		SeleniumInteracts.insertText(tipoRecurso, "Médico");
		SeleniumInteracts.clickButton(btnPesquisar);
	}
}
