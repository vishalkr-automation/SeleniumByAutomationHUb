package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementValidations {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
         driver.get("https://www.rediff.com/");	
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         //IsEnabled
         
         boolean element1=driver.findElement(By.xpath("//span[@class='hmsprite logo']")).isDisplayed();
         
         if(element1==true) {
        	 System.out.println("logo image displayed");
         }
         else {
        	 System.out.println("logo image no displayed");
         }
         
         //IsEnabled
         
         
        boolean element2=driver.findElement(By.xpath("//a[text()='Sign in']")).isEnabled();
         
         if(element2==true) {
        	 System.out.println("sign-in link is displayed");
         }
         else {
        	 System.out.println("sign-in link is not displayed");
         }
         
         //IsSelecetd
  
         driver.findElement(By.xpath("//a[text()='Sign in']")).click();
         boolean element3=driver.findElement(By.xpath(" //input[@id='remember']")).isSelected();
         
         if(element3==true) {
        	 System.out.println("Remember check box is selected");
         }
         else {
        	 System.out.println("Remember check box is not selected");
         }
         
         
      

	}

}
