package seleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintNameOfAllTheLinks {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        
        System.out.println("Total Links are available on the page: "+ allLinks);
       
        for(WebElement nameOfLinks:allLinks) {
        	System.out.println(nameOfLinks.getText());
        }

	}

}
