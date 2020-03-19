package desafioqa.noesis.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStart {

	public static WebDriver driver;
	
	
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.unimed.coop.br/");
	}
	
	
	public static void tearDown() {
		driver.quit();
	}
}
