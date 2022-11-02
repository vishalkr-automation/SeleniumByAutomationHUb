package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserExampleOfChromeAndFireFox {
	
	@Test
	public void f1() throws Exception{
		WebDriver driver;
		ChromeOptions chromeOptions;
		FirefoxOptions fireFoxOptions;
		
		WebDriverManager.chromedriver().setup();
		 chromeOptions=new ChromeOptions();
		 chromeOptions.setHeadless(true);
		 chromeOptions.addArguments("headless");
		 driver=new ChromeDriver(chromeOptions);
		 driver.get("https://money.rediff.com/");
		 System.out.println("Current URL: "+ driver.getCurrentUrl());
		 System.out.println("Current Title: "+driver.getTitle());
		 
		 Thread.sleep(2000);
		 
		 WebDriverManager.firefoxdriver().setup();
		 fireFoxOptions=new FirefoxOptions();
		 //fireFoxOptions.setHeadless(true);
		 fireFoxOptions.addArguments("--headless");
		 driver=new FirefoxDriver(fireFoxOptions);
		 driver.get("https://www.rediff.com/");
		 System.out.println("Current URL: "+ driver.getCurrentUrl());
		 System.out.println("Current Title: "+driver.getTitle());
		
	}

}
