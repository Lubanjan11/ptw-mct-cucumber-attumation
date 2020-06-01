package mct.steps.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHelper {

	
	WebDriver driver;	

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
	}
	
	public void launchApplication() {
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
	}

}
