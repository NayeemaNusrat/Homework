package hw14Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_isSelected_method {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.bestbuy.com/");
	Thread.sleep(3000);
	}
	
	// By default check box is not selected, so outcome is false
		@Test (enabled=true, priority = 1)
		public void loginButtonTest(){
			boolean checkBox =	driver.findElement(By.xpath("//button[@title='submit search']")).isSelected();
			System.out.println("Is the check Box Selected? Ans: "+checkBox);
		}
		
		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	
	
}
