package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitileAndCurrentURL {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
         driver.get("https://www.mycarhelpline.com/");	
         
         String pageTitle=driver.getTitle();
         System.out.println("Current Title of the Page: "+ pageTitle);
         
         String pageURL=driver.getCurrentUrl();
         System.out.println("Current URL of the page: "+pageURL);
          

	}

}
