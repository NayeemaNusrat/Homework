package hw_15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_maximize_fullScreen_deleteAllCookies_setSize_getSize_methods {

	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
    //fullscreen method
	@Test(enabled = true, priority = 1)
	public void fullScreenWindowTest() throws InterruptedException{		
		driver.get("https://www.ebay.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
	}
	
	 //maximize method
		@Test(enabled = true, priority = 2)
		public void maximizeWindowTest() throws InterruptedException{		
			driver.get("https://www.aliexpress.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
		}
   // getSize() method in px (pixel)
		@Test(enabled = true, priority = 4)
		public void sizeOfWindowTest() throws InterruptedException {		
			driver.get("https://www.bestbuy.com/");			
			driver.manage().window().fullscreen();
			Thread.sleep(5000);
			System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		}
		
		// deleteAllCookies() method
		@Test(enabled = true, priority = 3)
		public void deleteAllCookies() throws InterruptedException {					
			driver.manage().window().fullscreen();
			driver.manage().deleteAllCookies();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
		}
		
		//set a specific screen size:(1366,7680
		@Test(enabled = true, priority =5)		
		public void setASpecificSizeOfWindow() throws InterruptedException {
			Dimension dimension = new Dimension(800, 400);
			driver.manage().window().setSize(dimension);
			driver.manage().deleteAllCookies();
			driver.get("https://www.aliexpress.com/");
			Thread.sleep(4000);
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.manage().window().setSize(dimension);
			Thread.sleep(3000);
			
			
		}
		
		
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
