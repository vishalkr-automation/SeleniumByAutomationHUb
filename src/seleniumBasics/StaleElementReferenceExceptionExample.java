package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceExceptionExample {
	
	@Test(description="Problem",enabled=false)
	public void f1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class='footer alignC']//a"));
		System.out.println("Total footer links in rediff home page: "+footerlinks.size());
		
		for(int i=0; i<footerlinks.size(); i++) {
			System.out.println(footerlinks.get(i).getText());
			String url=footerlinks.get(i).getAttribute("href");
			System.out.println(url);
			
			System.out.println("---------------------------------");
			
			footerlinks.get(i).click();
			
			System.out.println("The title of the page is: "+driver.getTitle());
			driver.navigate().back();
			//footerlinks=driver.findElements(By.xpath("//div[@class='footer alignC']//a"));
		}
	}
		
		@Test(description="Solution",enabled=true)
		public void f2() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class='footer alignC']//a"));
			System.out.println("Total footer links in rediff home page: "+footerlinks.size());
			
			for(int i=0; i<footerlinks.size(); i++) {
				System.out.println(footerlinks.get(i).getText());
				String url=footerlinks.get(i).getAttribute("href");
				System.out.println(url);
				
				System.out.println("---------------------------------");
				
				footerlinks.get(i).click();
				
				System.out.println("The title of the page is: "+driver.getTitle());
				driver.navigate().back();
				footerlinks=driver.findElements(By.xpath("//div[@class='footer alignC']//a"));
			}	
	}

}
