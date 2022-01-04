package hw14Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getText_method {

WebDriver driver;
	
	@BeforeTest
	public void setup () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
	}
	@Test
	public void getTextTest() {
		WebElement caa = driver.findElement(By.xpath("//div[text()='Create an account']"));
		System.out.println("The text for the WebElement is: "+caa.getText());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
