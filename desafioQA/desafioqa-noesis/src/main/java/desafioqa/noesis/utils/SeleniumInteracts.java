package desafioqa.noesis.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import desafioqa.noesis.base.BrowserStart;

public class SeleniumInteracts {
	
	private static WebDriverWait wait;
	
	public static void clickButton(WebElement element) {
		try {
			dynamicWait().until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			System.out.println("Erro ao clicar no elemento => " + e.getMessage());
		}
	}
	
	public static void insertText(WebElement element, String text) {
		try {
			dynamicWait().until(ExpectedConditions.visibilityOf(element));
			Thread.sleep(1000);
			element.sendKeys(text);
			Thread.sleep(5000);
			element.sendKeys(Keys.TAB);
		} catch (Exception e) {
			System.out.println("Erro ao inserir texto no elemento => " + e.getMessage());
		}
	}
	
	public static WebDriverWait dynamicWait() {
		wait = new WebDriverWait(BrowserStart.driver, 25);
		return wait;
	}
	
	public static Select selectElement(WebElement element) {
		Select elemento = new Select(element);
		return elemento;
	}
}
