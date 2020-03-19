package desafioqa.noesis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuiaMedicoPage {

	@FindBy(css = "#menuPrincipalItens > ul > li:nth-child(2) > a")
	public WebElement menuGuiaMedico;
	
	public GuiaMedicoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickGuiaMedico() {
		menuGuiaMedico.click();
	}
}
