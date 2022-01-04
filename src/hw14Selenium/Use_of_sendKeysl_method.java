package hw14Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_sendKeysl_method {

	WebDriver driver;
	
	@BeforeTest
	public void setup () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com/");
		Thread.sleep(3000);
	}
	@Test (enabled=true, priority = 1)
	public void searchFieldTest() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys("Laptop");
		Thread.sleep(4000);
		}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
