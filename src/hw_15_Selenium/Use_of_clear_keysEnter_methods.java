package hw_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_clear_keysEnter_methods {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com/");
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 1)
	public void searchAProductTest() throws InterruptedException{		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(4000);
	 driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tv");
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}


}

