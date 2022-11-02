package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompundClassExample {
	
	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//class="signin"
		//class="moneyicon relative"  - compound class
		
		//Problem of compound class
		//driver.findElement(By.cssSelector("moneyicon relative")).click();   //It will not work
		
		//Solution of compound class
		
		//Using xpath
		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		System.out.println("Get page title: "+ driver.getTitle());
		
		driver.navigate().to("https://www.rediff.com/");
		
		//Using cssSelector
		driver.findElement(By.cssSelector("a.eproicon.relative")).click();	
		System.out.println("Get page title: "+ driver.getTitle());
		
	}

}
