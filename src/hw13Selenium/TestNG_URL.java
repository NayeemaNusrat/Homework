package hw13Selenium

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_URL {
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
	driver=(WebDriver) new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();	
	Thread.sleep(4000);
	}
	@Test
	public void urlTest() throws InterruptedException {
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
	}
	@AfterTest
	public void tearup () {
		driver.quit();
	}
	
	
	
	
	}


