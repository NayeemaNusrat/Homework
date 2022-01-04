package hw14Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isEnabled_method {
	
	WebDriver driver ;
	
	@BeforeTest
	public void setup () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}
	
	@Test (enabled=true, priority = 1)
	public void loginButtonTest() throws InterruptedException{
		boolean loginEnabled =	driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: "+loginEnabled);
	}
	
	@AfterTest
	public void tearup () {
		driver.quit();
	}
}

