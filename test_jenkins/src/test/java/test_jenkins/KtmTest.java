package test_jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KtmTest {
	WebDriver driver;
	
	@Test
	public void ktm() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get("https://www.ktm.com/en-us.html");
		driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	     driver.quit();
	  
		
	}

}

