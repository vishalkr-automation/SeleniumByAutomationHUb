package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
        driver.get("https://www.monsterindia.com/");	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
   
        driver.findElement(By.xpath("//a[@title='Click to upload your resume']")).click();
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\visha\\OneDrive\\Desktop\\sample.docx");
      

	}

}
