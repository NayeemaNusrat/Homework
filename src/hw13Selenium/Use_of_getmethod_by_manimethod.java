package hw13Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_of_getmethod_by_manimethod {

		public static void main(String[] args) {
			// System is a class and setProperty is a method
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
			// WebDriver is an interface and ChromeDriver is a concrete class which implements WebSriver interface
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.amazon.com");
			driver.quit();
	
	}

}
