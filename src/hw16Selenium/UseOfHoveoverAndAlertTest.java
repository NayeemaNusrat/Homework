package hw16Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class UseOfHoveoverAndAlertTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
	}

	@Test (enabled = true, priority = 1)
	public void mouseHoverActionOnAmazonHomeTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement amazonHome = driver.findElement(By.xpath("//a[contains(text(), 'Amazon Home') and @class='nav-a  ']"));
		actions.moveToElement(amazonHome).build().perform();
		Thread.sleep(6000);
		// This below is not a part of the above action
		// It is not must, but better to show
		System.out.println("\nThe text of this web element is: "+ amazonHome.getText());
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.close();
	}

}
