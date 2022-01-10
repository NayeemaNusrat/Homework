package hw16Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_selectByValue_method {

		WebDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.ebay.com/");
		}

		@Test
		public void selectByValueTest() throws InterruptedException {
			WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
			Select select = new Select(dropdown);
			select.selectByValue("10542");
			Thread.sleep(5000);
		}
		
		@AfterTest
		public void tearUp() {
			driver.close();
		}

}
