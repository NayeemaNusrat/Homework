package hw14Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isDisplayed_method {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com/");
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)
	public void logoTest() {
		boolean elementDisplayed = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
		System.out.println("Is the logo displayed? Ans: " + elementDisplayed);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
